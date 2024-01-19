package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import POJO.UserValidation;
import CommonConnection.commonConnection;
public class Validation {
	
	public int Check(UserValidation u,String email1)
	{
		int flag=0;
		String email2=email1;
		try{
			
			Connection connection = commonConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("select * from register where email=?");
			ps.setString(1, email2);
	        ResultSet rs1=ps.executeQuery();
	        while(rs1.next())
	        {
	        	 
			        String name=rs1.getString("name");
			        String name2=u.getSname();
			     
			        if(name.equals(name2))
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
