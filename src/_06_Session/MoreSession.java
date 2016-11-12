package _06_Session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/moresession")
public class MoreSession extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String ID =session.getId();
		
		long ct = session.getCreationTime();
		
		Date dateCreate = new Date(ct);
		
		long lastAcces = session.getLastAccessedTime();
		
		Date DateAcces = new Date(lastAcces);
		
		int maxInactive = session.getMaxInactiveInterval();
		
		System.out.println("session ID :"+ID);
		System.out.println("date Create :"+dateCreate);
		System.out.println("lastAcces :"+lastAcces);
		System.out.println("DateAcces :"+DateAcces);
		System.out.println("maxInactive :"+maxInactive);
		// varsayilan olarak tomcat session suresi 30 dakikadir...
		// bunu veb.xml den degistirebiliriz...
		// 0 veya negatif timeout suresi verilirse session suresi sonsuzdur...
		
		session.setAttribute("name", "Tolga");
		session.setMaxInactiveInterval(10); //saniyedir...
		
		PrintWriter pw = resp.getWriter();

		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");

		pw.print("<a href='gettimeout> Time out after 5 seconds </a>'");

		pw.println("</body>");
		pw.println("</html>");
	}
	
}
