package com.missiontomars.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.missiontomars.db.Database;
import com.missiontomars.db.DbOperator;
import com.missiontomars.models.User;

/**
 * Servlet implementation class loginController
 */
@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected Database db;
    /**
     * @throws IOException 
     * @throws JsonMappingException 
     * @throws JsonParseException 
     * @see HttpServlet#HttpServlet()
     */
    public loginController() throws JsonParseException, JsonMappingException, IOException {
        super();
        this.db = DbOperator.getDatabase();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		for(User user : this.db.getUsers()) {
			if (user.getUsername().equals(username)
					&& user.getPassword().equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("loginUser", user);
				response.sendRedirect("index.jsp");
				return;
			}
		}
		response.sendRedirect("login.jsp");
	}

}
