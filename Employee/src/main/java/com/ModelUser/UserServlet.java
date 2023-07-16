package com.ModelUser;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res ) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		Long number = Long.parseLong(req.getParameter("phone"));
		String location = req.getParameter("loc");
		String job = req.getParameter("job");
		int Salary = Integer.parseInt(req.getParameter("sal"));
		String password = req.getParameter("pass");
		ModelUser ml = new ModelUser(id,name,number,location,job,Salary,password);
		UserDao u1 = new UserDao();
		try {
			if(u1.insert(ml)) {
				res.sendRedirect("Sucess.html");
			}
			else {
				res.sendRedirect("RegistrationForm.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
