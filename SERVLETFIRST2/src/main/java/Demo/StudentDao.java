package Demo;

import Demo.controller.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao 
{
	
	public String saveStudent(Student student)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/student11";
			String user="root";
			String pass="password";
			Connection con=DriverManager.getConnection(url,user,pass);
			String query="INSERT INTO student2 VALUES (?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1,student.getId());
			ps.setString(2, student.getName());
			ps.setString(3,student.getEmail());
			ps.setString(4, student.getIdCardNumber());
			int res=ps.executeUpdate();
			con.close();
			return res+"row of data added succesfully";
			
		}catch(ClassNotFoundException || SQLException e)
		{
			e.printStackTrace();
		}
		return "somthing wenr wrong";
	}
	public Student  getStudentById(int id)
	{
		String query="SELECT * FROM student2  WHERE id=?";
	    Connection con=getConnection();
	    try {
	    	PreparedStatement ps=con.prepareStatement(query);
	    	ps.setInt(1,id);
	    	ResultSet res=ps.executeQuery();
	    	Student student=new Student();
	    	if(res.next())
	    	{
	    		student.setId(res.getInt(1));
	    		student.setName(res.getString(2));
	    		student.setEmail(res.getString(3));
	    		student.setIdCardNumber(res.getString(4));
	    	}
	    	con.close();
	      	return student;
		
	    }catch(SQLException e)
	    {
	    	e.printStackTrace();
	    }
	    return null;
		
	}
	private Connection getConnection() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		//String url="jdbc:mysql://loaclhost:3306/student11";//"jdbc:mysql://localhost:3306/jdbc","root","password"
		//String user="root";
		//String pass="password";
	
			 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student11","root","password");
			 System.out.println("connected");
			 return connection;
		} catch(ClassNotFoundException|SQLException|NullPointerException e) {
			e.printStackTrace();
		}
       return null;
	}
	

}
