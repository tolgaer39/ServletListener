package _07_Cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookietimeoutcheck")
public class CookieTimeOutCheck extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		Cookie[] cookies = req.getCookies();
		
		if(cookies!=null){
			for(Cookie c:cookies){
				System.out.println(c.getName()+""+c.getValue());
			}
		}
		else{
			System.out.println("no cookie");
		}
		
	}

}
