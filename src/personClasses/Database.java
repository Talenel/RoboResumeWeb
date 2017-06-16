package personClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {

	public Database() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getPersonID()
	{
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select persID from Person order by persID asc";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			rs.last();
			return rs.getString(1);
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
		
		
		
		
	}
	
	
	public String getEmplomentID()
	{
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select empID from Employment order by empID asc";
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			rs.last();
			return rs.getString(1);
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	
	}
	
	

	public void addPerson(String name, String email)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		
		
		String sql = "Insert into Person(persName,email) values(?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.execute();
			 
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
	public void addSchooling(String college, int yearGrad, String degType, String degMajor,String persID)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		String sql = "Insert into Schooling(persID, degType, degMajor, college, yearGrad) values(?,?,?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, persID);
			stmt.setString(2, degType);
			stmt.setString(3, degMajor);
			stmt.setString(4, college);
			stmt.setInt(5, yearGrad);
			stmt.execute();

			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void addEmployment(String title, String company, String startDate, String endDate, String persID)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		String sql = "Insert into Employment(persID, title, company, startDate, endDate) values(?,?,?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, persID);
			stmt.setString(2, title);
			stmt.setString(3, company);
			stmt.setString(4, startDate);
			stmt.setString(5, endDate);
			stmt.execute();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public void addDuty(String empID, String dutyDesc)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		String sql = "Insert into Duty(empID, dutyDesc) values(?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1,empID);
			stmt.setString(2, dutyDesc);
			stmt.execute();
			
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	public void addSkills(String persID, String skillName,String skillRating)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		String sql = "Insert into Skill(persID, skillName, skillRating) values(?,?,?)";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/ResumeInfo?autoReconnect=true&useSSL=false&"
                                + "user=root&password=password");
			stmt = con.prepareStatement(sql);
			stmt.setString(1, persID);
			stmt.setString(2, skillName);
			stmt.setString(3, skillRating);
			stmt.execute();
			 
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	
	

}
