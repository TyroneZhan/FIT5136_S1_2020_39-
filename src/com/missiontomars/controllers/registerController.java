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
import com.missiontomars.models.Candidate;

/**
 * Servlet implementation class registerController
 */
@WebServlet("/registerController")
public class registerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected Database db;
       
    /**
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @see HttpServlet#HttpServlet()
     */
    public registerController() throws JsonParseException, JsonMappingException, IOException {
        super();
        this.db = DbOperator.getDatabase();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
		String address = request.getParameter("address");
		String nationality = request.getParameter("nationality");
		String idNumber = request.getParameter("idNumber");
		String gender = request.getParameter("gender");
		String allergies = request.getParameter("allergies");
		String food = request.getParameter("food");
		String qualification = request.getParameter("qualification");
		String work = request.getParameter("work");
		String occupations = request.getParameter("occupations");
		String computer = request.getParameter("computer");
		String languages = request.getParameter("languages");
		String criminal = request.getParameter("criminal");
		String health = request.getParameter("health");
		int maxId = 0;
		for(Candidate can : this.db.getCandidates()) {
			if(can.getId() > maxId) {
				maxId = can.getId();
			}
		}
		Candidate candidate = new Candidate();
		candidate.setId(maxId + 1);
		candidate.setName(name);
		candidate.setBirthday(birthday);
		candidate.setAddress(address);
		candidate.setNationality(nationality);
		candidate.setIdNumber(idNumber);
		candidate.setGender(gender);
		candidate.setAllergies(allergies);
		candidate.setFood(food);
		candidate.setQualification(qualification);
		candidate.setWork(work);
		candidate.setOccupations(occupations);
		candidate.setComputer(computer);
		candidate.setLanguages(languages);
		candidate.setCriminal(criminal);
		candidate.setHealth(health);
		this.db.getCandidates().add(candidate);
		DbOperator.flush();
		response.getWriter().append("Register successfully.");
	}

}
