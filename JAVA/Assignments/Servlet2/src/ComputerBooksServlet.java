import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Computer")
public class ComputerBooksServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = session.getAttribute("uname").toString();
		
		PrintWriter out=response.getWriter();
		out.print("<html>"
				+ "<head><title>Computer Books</title></head>"
				+ "<body><h1>"+" Welcome "+userName+" </h1>"
				+ "<form action='controller?forward=History' method='post'>"
				+ "<input type= checkbox name = 'book' value = 'C' >C<br>"
				+ "<input type= checkbox name = 'book' value = 'C++' >C++<br>"
				+ "<input type= checkbox name = 'book' value = 'Java' >Java<br><br><br>"
				+ "<input type= submit value='Next'/>"
				+ "</form></body>"
				+ "</html>"
				);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
