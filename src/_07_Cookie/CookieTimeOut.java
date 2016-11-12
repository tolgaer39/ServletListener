package _07_Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookietimeout")
public class CookieTimeOut extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		Cookie name = new Cookie("name", "Tolga");
		Cookie password = new Cookie("name", "123");		
		
		//eklemeden once yazmamiz lazim addCookie den once...
		name.setMaxAge(7);
		password.setMaxAge(7);
		
		resp.addCookie(name);
		resp.addCookie(password);
		
		
		PrintWriter pw = resp.getWriter();
		
		String url = "cookietimeoutcheck";
		pw.println("<a href=\""+url+"\">Click Here</a>");

	}

}
