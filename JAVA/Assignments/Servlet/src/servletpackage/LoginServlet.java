package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException{
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		if(uname.equals("basit") && pass.equals("basit")){
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html><body><h1>Login Successful</h1></body></html>");
		}
		else{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<html><body><h1>Login Unsuccessful</h1></body></html>");
		}
		
	}
	
	
	
}
