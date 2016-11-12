package _03_ServletRequestListener;

import java.util.Date;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class ServletRequestListenerImp implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		
		System.out.println("resuest Destroyed");
		HttpServletRequest request = (HttpServletRequest) sre.getServletContext();
		
		String servletpath = request.getServletPath();
		
		Date date = new Date();
		
		System.out.println(servletpath + " "+date);
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		
	}

}
