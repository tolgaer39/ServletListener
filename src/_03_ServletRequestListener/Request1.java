package _03_ServletRequestListener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request1")
public class Request1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setAttribute("name", "tolga");
		
		req.setAttribute("name2", "ergun");
		
		req.removeAttribute("name");
		
	}
}
