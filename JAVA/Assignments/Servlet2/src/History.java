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

@WebServlet("/History")
public class History extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName = session.getAttribute("uname").toString();
		String computerBooks[]=request.getParameterValues("book");
		for(String item:computerBooks){
			System.out.println(item);
		}
		ArrayList<String> list = new ArrayList<>(Arrays.asList(computerBooks));
		session.setAttribute("book", list);
		PrintWriter out=response.getWriter();
		out.print("<html>"
				+ "<head><title>Computer Books</title></head>"
				+ "<body><h1>"+" Welcome "+userName+" </h1>"
				+ "<form action=\"controller?forward=ShoppingCart\" method='post'>"
				+ "<input type= checkbox name = 'book' value = 'History1' >H1<br>"
				+ "<input type= checkbox name = 'book' value = 'History2' >H2<br>"
				+ "<input type= checkbox name = 'book' value = 'History3' >H3<br><br><br>"
				+ "<input type= submit value='Add To Cart'/>"
				+ "</form></body>"
				+ "</html>"
				);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

