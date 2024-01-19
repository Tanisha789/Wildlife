package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import POJO.AdminValidation;
import CommonConnection.commonConnection;
public class AdValidation {
	
	public int Check(AdminValidation u,String pass,String email)
	{
		int flag=0;
		String pass2=pass;
		String email2=email;
		try{
			
			Connection connection = commonConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("select * from admin where password=? and email=?");
			ps.setString(1, pass2);
			ps.setString(2,email2);
	        ResultSet rs1=ps.executeQuery();
	        while(rs1.next())
	        {
	        	    
			        String name=rs1.getString("name");
			       
			       
			        if(name.equals(u.getSname()) && email.equals(u.getSmail()))
			        {
			      
			        	flag=1;
			        }	
			       
			        else
			        {
			        	
			        	flag=0;
			        }
	        }
	       
			   	   
		}
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	
	if(flag==1)
	{
		return 1;
	}
	else
		return 0;
	
	}

	
}
