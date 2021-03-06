import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Shopping")
public class ShoppingCart extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = session.getAttribute("uname").toString();
		String historyBooks[]=request.getParameterValues("book");
		ArrayList<String> allBooks = (ArrayList<String>)session.getAttribute("book");
		for(String item:historyBooks){
			allBooks.add(item);
			
		}
		
		
		PrintWriter out=response.getWriter();
		for(String s:allBooks){
			out.println(s);
		}
		out.print("<html>"
				+ "<head><title>Computer Books</title></head>"
				+ "<body><h1>"+" Welcome "+userName+" </h1>"
				+ "<form action=\"controller?forward=Logout\" method='post'>"
				+"<input type= submit value='Logout'/>"
				+ "</form></body>"
				+ "</html>"
				);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

