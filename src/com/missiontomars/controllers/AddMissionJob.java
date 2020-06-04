package com.missiontomars.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.missiontomars.db.Database;
import com.missiontomars.db.DbOperator;
import com.missiontomars.models.MissionJob;

/**
 * Servlet implementation class AddMissionJob
 */
@WebServlet("/AddMissionJob")
public class AddMissionJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected Database db;
       
    /**
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @see HttpServlet#HttpServlet()
     */
    public AddMissionJob() throws JsonParseException, JsonMappingException, IOException {
        super();
        this.db = DbOperator.getDatabase();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		String requiredNumber = request.getParameter("requiredNumber");
		String missionId = request.getParameter("missionId");
		MissionJob job = new MissionJob();
		job.setMissionId(Integer.parseInt(missionId));
		job.setName(name);
		job.setDescription(description);
		job.setRequiredNumber(Integer.parseInt(requiredNumber));
		int maxId = 0;
		for(MissionJob j : this.db.getMissionJobs()) {
			if (j.getId() > maxId) {
				maxId = j.getId();
			}
		}
		job.setId(maxId + 1);
		this.db.getMissionJobs().add(job);
	}

}
