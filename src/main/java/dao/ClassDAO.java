package dao;


import java.sql.*;

import model.Student;

public class ClassDAO {
	public  static Connection connect() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://prepboostdb-instance.cyafp3ivtaw2.us-east-2.rds.amazonaws.com:3306/prepboostdb" ;
		String user="root";
		String pass="Hello123*";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;
		}
	public void setData(Student s) throws SQLException, ClassNotFoundException {
		
		Connection con =connect();
		 
		String query="insert into studentinfo values(?,?,?,?,?,?,?);";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, s.getName());
		st.setString(2, s.getEmail());
		st.setString(3, s.getPhnNo());
		st.setString(4, s.getDob());
		st.setString(5, s.getSchlName());
		st.setDouble(6, s.getPhyMarks());
		st.setDouble(7, s.getTotalMarks());
		st.executeUpdate();
		
	}

}
