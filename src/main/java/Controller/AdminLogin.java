package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.AdValidation;
import POJO.AdminValidation;
@WebServlet("/ccc")
public class AdminLogin extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String sname = req.getParameter("sname");
		String smail = req.getParameter("smail");
		String pass = req.getParameter("password");
		AdminValidation u=new AdminValidation(sname,smail,pass);
		AdValidation v=new AdValidation();
        int i=v.Check(u, pass,smail);
        if(i==1)
            resp.sendRedirect("AdminContent.jsp");
        else
        {
        	out.println("<html>");
        	out.println("<head>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<h1>");
        	out.println("<mark>");
        	out.println("wrong name or email id or password");
        	out.println("</h1>");
        	out.println("</mark>");
        	out.println("</body>");
        	out.println("</html>");
   	

        }
        	
	
		
	}
	

}
