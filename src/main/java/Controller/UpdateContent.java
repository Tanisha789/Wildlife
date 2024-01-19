package Controller;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import CommonConnection.*;

@WebServlet("/ddd")
public class UpdateContent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String content1 = req.getParameter("contentTiger");
		String content2 = req.getParameter("contentElephant");
		String content3 = req.getParameter("contentRhino");
		String content4 = req.getParameter("contentMonkey");
		
	
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		Connection connection = null;
		try 
		{
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/iwtproject","root","root");
			if(content1!=null)
			{  
				
				PreparedStatement ps1=connection.prepareStatement("update organism set description=? where id=1");
				ps1.setString(1,content1);
		        int i1=ps1.executeUpdate();
			}
			
			if(content2!=null)
			{
				
				PreparedStatement ps2=connection.prepareStatement("update organism set description=? where id=2");
				ps2.setString(1,content2);
				int i2=ps2.executeUpdate();
				
			  
			}
			
			if(content3!=null)
			{
				
				PreparedStatement ps3=connection.prepareStatement("update organism set description=? where id=3");
				ps3.setString(1,content3);
				int i3=ps3.executeUpdate();
				
			}
			
			if(content4!=null)
			{
				
				PreparedStatement ps4=connection.prepareStatement("update organism set description=? where id=4");
				ps4.setString(1,content4);
				int i4=ps4.executeUpdate();
				
			}
			
			 resp.sendRedirect("Content.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
