package Controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.Register;
import DAO.Validation;
import POJO.UserRegister;

@WebServlet("/aaa")
public class ServletRegister extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sname = request.getParameter("sname");
		String smail = request.getParameter("smail");
		UserRegister user = new UserRegister(sname,smail);
		Register d=new Register();
		d.save(user);
		response.sendRedirect("index.html");
		
	}
	

}
