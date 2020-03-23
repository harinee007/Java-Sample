package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Complaint;

public class complaintDao {
	public Complaint getComaplintWithFeedback(int compid) {
		Complaint complaint=null;
		Connection cn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			//Step 1: Initialize the driver.
			Class.forName("oracle.jdbc.OracleDriver");
			
			//Step 2: Establish a connection with database.
			cn=DriverManager.getConnection("jdbc:oracle:thin:@intvmoradb04:1521:ORAJAVADB","SYSTEM","sastra123");
			
			//Step 3: Create a Prepared Statement object to execute the query.
			ps=cn.prepareStatement("SELECT * FROM Complaint_CT20151624094 WHERE complaintid="+compid);
			
			//Step 4: Execute the query and store the result in Resultset object.
			rs=ps.executeQuery();
			
			//Step 5: Iterate the Resultset object and extract the table values.
			while(rs.next()) {
				int id=rs.getInt(1);
				String type=rs.getString(2);
				String desc=rs.getString(3);
				String st=rs.getString(4);
				String com=rs.getString(5);
				if(complaint==null) {
					complaint=new Complaint(id,type,desc,st,com);
				}
			}
			
			//Step 6: Close the Connection.
			rs.close();
			ps.close();
			cn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return complaint;
	}
	
	
	public void updatesComplaintStatus(int compid,String status) {
		Connection cn=null;
		PreparedStatement ps=null;
		try {
			//Step 1: Initialize the driver.
			Class.forName("oracle.jdbc.OracleDriver");
			
			//Step 2: Establish a connection with database.
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","sastra123");
			
			//Step 3: Create a Prepared Statement object to execute the query.
			ps=cn.prepareStatement("UPDATE complaint_CT20141624094 SET STATUS=? WHERE complaintid="+compid);
			ps.setString(1, status);
			
			//Step 4: Call the executeUpdate() method to execute the query.
			ps.executeUpdate();
			
			//Step 5: Close the Connection.
			ps.close();
			cn.close();
			
		} catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
 
	


