package com.ModelUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
	public boolean insert(ModelUser m1) throws SQLException {
		boolean result =false;
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "DHanam06#");
			String query = "insert into EmployeeForm (Id,Ename,PhoneNumber,Location,Job,Salary,Password) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(1, m1.getId());
			pst.setString(2, m1.getName());
			pst.setLong(3, m1.getNumber());
			pst.setString(4, m1.getLocation());
			pst.setString(5,m1.getJob());
			pst.setInt(6, m1.getSalary());;
			pst.setString(7, m1.getPassword());
			int res = pst.executeUpdate();
			result = (res>0);
			pst.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return result;
		}
		
		return result;
		
	}
}
