package _02_ServletContextAttributeListener;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletcontextattributetest")
public class ServletContextAttributeTest extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		context.setAttribute("name", "tolga");
		// context scope a bir attribute eklendiginde   attributeadded methodu calisir...
		
		context.setAttribute("name", "owerride tolga");
		//context scope da bir attribute override edildiginde attributereplace calisir... 
		
		context.removeAttribute("name");
		//context scope dan attribute silindiginde attributedremoved methodu calisir...
	}

}
