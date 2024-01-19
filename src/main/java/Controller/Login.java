package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.Validation;
import POJO.UserValidation;

@WebServlet("/bbb")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String sname = req.getParameter("sname");
		String smail = req.getParameter("smail");
		UserValidation u=new UserValidation(sname,smail);
		Validation v=new Validation();
        int i=v.Check(u, smail);
        if(i==1)
            resp.sendRedirect("Content.jsp");
        else
        {
        	out.println("<html>");
        	out.println("<head>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<h1>");
        	out.println("<mark>");
        	out.println("wrong name or email id");
        	out.println("</h1>");
        	out.println("</mark>");
        	out.println("</body>");
        	out.println("</html>");   	

        }
		
	}
}
