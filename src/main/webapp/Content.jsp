<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="CommonConnection.*" %>
 <jsp:scriptlet>
		      
		        Connection connection = commonConnection.getConnection();
				PreparedStatement ps1=connection.prepareStatement("select * from organism where id=?");
				
		      
 </jsp:scriptlet>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Indian Wildlife</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    
</head>
<body style="background-color:darkcyan">
<div class="header" style="background-color:forestgreen ">
  <img src="images/logo.png" style="width:100px;height:100px; float: left;">
  <div class="header-right">
    <a href="index.html">Home</a>
    <div class="dropdown">
      <a href="Register.html">Register</a>
    </div>
    <div class="dropdown">
	 <a class="active">Login</a><br><br><br>
	 <i class="fa fa-caret-down"></i>
      </button>
      <div class="dropdown-content">
        <a href="LoginStudent.html">Student</a>
        <a href="LoginAdmin.html">Admin</a>
      </div>
      
     </div>  
    <a href="Aboutus.html">About Us</a>
  </div>
  <marquee scrollamount="30"><h1 style="color:cyan;">Indian Wildlife</h1></marquee>
</div>

<div style="padding-left:20px">
   
    
    <div class="animal-container">
        <!-- Animals -->
        <div class="animal-card">
            <img src="images/tiger.jpg" alt="Tiger" class="animal-image">
            <div class="animal-name">Tiger
            </div>
            <div class="animal-description">
		    </div>
		      <jsp:scriptlet>
		        ps1.setInt(1,1);
		        ResultSet rs1=ps1.executeQuery();
		        while(rs1.next())
		        {
		        	out.println(rs1.getString("description"));
		        	
		        }
		       </jsp:scriptlet>
            </div>
       
        <!-- Animals -->
        <div class="animal-card">
            <img src="images/elephant.jpg" alt="Elephant" class="animal-image">
            <div class="animal-name">
             Elephant
            </div>
            <div class="animal-description"> </div>
               <div>
                   <jsp:scriptlet>
		           ps1.setInt(1,2);
		         ResultSet rs2=ps1.executeQuery();
		        while(rs2.next())
		        {
		        	out.println(rs2.getString("description"));
		     	
		        	
		        }
		       </jsp:scriptlet>
              </div>
       </div>
       </div>
	<div class="animal-container">
       <!-- Animals -->
        <div class="animal-card">
            <img src="images/rhino.jpg" alt="Rhino" class="animal-image">
            <div class="animal-name">
             Rhino
            </div>
            <div class="animal-description"></div>
            <div>
                   <jsp:scriptlet>
		           ps1.setInt(1,3);
		        ResultSet rs3=ps1.executeQuery();
		        while(rs3.next())
		        {
		        	out.println(rs3.getString("description"));
		        	
		        }
		       </jsp:scriptlet>
		    </div>
		    </div>
        <!-- Animals -->
        <div class="animal-card">
            <img src="images/monkey.jpg" alt="monkey" class="animal-image">
            <div class="animal-name">
             Monkey
            
            </div>
            <div class="animal-description">
                <jsp:scriptlet>
		        ps1.setInt(1,4);
		        ResultSet rs4=ps1.executeQuery();
		        while(rs4.next())
		        {
		        	out.println(rs4.getString("description"));
		        	
		        }
		       </jsp:scriptlet>
            </div>
        </div>
        </div>
        
</body>
</html>