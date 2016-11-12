package _05_Session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/hellohttpsession")
public class HelloHttpSession extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//Servler sinifi ilk calistirildiginda tarayiciya JSESSIONID adinda bir cookies objesi doner...
		HttpSession session = req.getSession();
		
		//id sini yazdiralim
		System.out.println(session.getId());
	}
}
