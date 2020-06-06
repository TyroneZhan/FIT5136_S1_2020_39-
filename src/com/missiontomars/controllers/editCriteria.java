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
import com.missiontomars.models.Criteria;

/**
 * Servlet implementation class editCriteria
 */
@WebServlet("/editCriteria")
public class editCriteria extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected Database db;
       
    /**
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @see HttpServlet#HttpServlet()
     */
    public editCriteria() throws JsonParseException, JsonMappingException, IOException {
        super();
        this.db = DbOperator.getDatabase();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String jobId = request.getParameter("jobId");
		String quantity = request.getParameter("quantity");
		String minAge = request.getParameter("minAge");
		String maxAge = request.getParameter("maxAge");
		String workExperience = request.getParameter("workExperience");
		String occupations = request.getParameter("occupations");
		String health = request.getParameter("health");
		String criminal = request.getParameter("criminal");
		String computer = request.getParameter("computer");
		String languages = request.getParameter("languages");
		
		Criteria criteria = null;
		
		for(Criteria cr : this.db.getCriterias()) {
			if(cr.getJobId() == Integer.parseUnsignedInt(jobId)) {
				criteria = cr;
				break;
			}
		}
		if(criteria == null) {
			criteria = new Criteria(Integer.parseUnsignedInt(jobId));
			this.db.getCriterias().add(criteria);
		}
		criteria.setTitle(title);
		criteria.setQuantity(Integer.parseInt(quantity));
		criteria.setMinAge(Integer.parseInt(minAge));
		criteria.setMaxAge(Integer.parseInt(maxAge));
		criteria.setWorkExperience(Integer.parseInt(workExperience));
		criteria.setOccupations(occupations);
		criteria.setHealth(health);
		criteria.setCriminal(criminal);
		criteria.setComputer(computer);
		criteria.setLanguages(languages);
		DbOperator.flush();
		response.sendRedirect("editCriteria.jsp?jobId=" + jobId);
	}

}
