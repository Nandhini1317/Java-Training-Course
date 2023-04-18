
package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dal.helper.MyDBConnection;
import com.dal.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	
	@Override
	public void insertEmployee(Employee emp) {
	     
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("insert into dal values(?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from dal");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("update dal  set dept ='visit' where empid=?");	
//			ps.setString(2, emp.getDept());
			ps.setInt(1, emp.getEid());
			
			int nowupdated = ps.executeUpdate();
			System.out.println(nowupdated  + " got updated... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("delete from dal where empid=?");	
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int nowdeleted = ps.executeUpdate();
			System.out.println(nowdeleted  + " got deleted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
	}

}