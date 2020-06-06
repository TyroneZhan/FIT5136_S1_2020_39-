package com.missiontomars.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.missiontomars.db.Database;
import com.missiontomars.db.DbOperator;
import com.missiontomars.models.Mission;
import com.missiontomars.models.User;

/**
 * Servlet implementation class editMissionController
 */
@WebServlet("/editMissionController")
public class editMissionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected Database db;
	
    /**
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @see HttpServlet#HttpServlet()
     */
    public editMissionController() throws JsonParseException, JsonMappingException, IOException {
        super();
        this.db = DbOperator.getDatabase();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Integer id = Integer.parseInt(request.getParameter("id") != null ? request.getParameter("id") : "0");
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String countryOfOrigin = request.getParameter("countryOfOrigin");
		String countriesAllowed = request.getParameter("countriesAllowed");
		String cargoRequirements = request.getParameter("cargoRequirements");
		String launchDateString = request.getParameter("launchDate");
		String destinationAddress = request.getParameter("destinationAddress");
		String durationOfMission = request.getParameter("durationOfMission");
		String cargoName = request.getParameter("cargoName");
		String cargoNumber = request.getParameter("cargoNumber");
		String status = request.getParameter("status");
		if(status == null) {
			status = "planning_phase";
		}
		String shuttle = request.getParameter("shuttle");
		if(shuttle == null) {
			shuttle = "0";
		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		User loginUser = (User) request.getSession().getAttribute("loginUser");
		int maxId = 0;
		Mission targetMission = this.db.findMissionByPk(id);
		if(targetMission == null) {
			targetMission = new Mission();
			for(Mission mission : this.db.getMissions()) {
				if(maxId < mission.getId()) {
					maxId = mission.getId();
				}
			}
			targetMission.setId(maxId + 1);
			this.db.getMissions().add(targetMission);
		}
		targetMission.setName(name);
		targetMission.setDescription(description);
		targetMission.setCountryOfOrigin(countryOfOrigin);
		targetMission.setCountriesAllowed(countriesAllowed);
		targetMission.setCoordinatorId(loginUser.getId());
		targetMission.setCargoRequirements(cargoRequirements);
		targetMission.setShuttleId(Integer.parseInt(shuttle));
		targetMission.setCargoName(cargoName);
		targetMission.setCargoNumber(cargoNumber);
		try {
			targetMission.setLaunchDate(dateFormat.parse(launchDateString));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		targetMission.setDestinationAddress(destinationAddress);
		targetMission.setDurationOfMission(Integer.parseInt(durationOfMission));
		targetMission.setStatus(status);
		DbOperator.flush();
		response.sendRedirect("missionEdit.jsp?missionId=" + targetMission.getId());
	}

}
