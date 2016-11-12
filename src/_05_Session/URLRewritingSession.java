package _05_Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/urlrewriting")
public class URLRewritingSession extends HttpServlet {

	//session yonetimi session objeleri uzerinde sessionid ile gerceklesir.
	//kullanici tarayicininn cookie ozellgini kapatabilir ve durumda session yonetimi yapamayiz. chromedan cerezleri kapatip gorebiliriz...
	//bunu cozmek ýcýn urlrewriting islemi yapilir...
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		HttpSession session = req.getSession();
		session.setAttribute("name", "tolga");
		
		pw.print("<a href='getsession'>not encode clik me </>'");
		
		String encodeUrl = resp.encodeURL("getsession");
		// butun url adresleri encodeURL methodu ile encoding yapilirsa cookiker/cerezler kapali bile olsa session yonetimi yapilabilir...
		//bu mekanizmaya urlrewriting islemi denir...
		//urlin sonuna JSESSIONID = SESSIONID eklenir.
		

		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>URL Rewriter</title>");
		pw.println("</head>");
		pw.println("<body>");

		pw.print("<a href='encodeUrl'> encoded clik me </>'");

		pw.println("</body>");
		pw.println("</html>");
		
	}
	
}
