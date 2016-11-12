package _01_ServletContextListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletRequestListener;

public class ListenerNotes {
	
	// javax.servlet.ServletContextListener
	// public void contextInitialized(ServletContextEvent sce);
	// public void contextDestroyed(ServletContextEvent sce);

	//javax.servlet.ServletContextAttributeListener
	//public void attributeAdded(ServletContextAttributeEvent sca)
	//public void attributeRemoved(ServletContextAttributeEvent sca)
	//public void attributeReplaced(ServletContextAttributeEvent sca)
	
	// javax.servlet.ServletRequestListener
	//public void requestInitialized(ServletRequestEvent sre);
	//public void requestDestroyed(ServletRequestEvent sre);

	//javax.servlet.ServletRequestAttributedListener
	//public void attributeAdded(ServletRequestAttributeEvent sca)
	//public void attributeRemoved(ServletRequestAttributeEvent sca)
	//public void attributeReplaced(ServletRequestAttributeEvent sca)

	// javax.servlet.httpsessionListener
	// public void sessionCreated(HttpSessionEvent se);
	// public void sessionDestroyed(HttpSessionEvent se);

	// javax.servlet.http.HttpSessionAtributedListener
	// public void attributedAdden(HttpSessionBindingEvent sbe)
	// public void attributedRemoved(HttpSessionBindingEvent sbe)
	// public void attributedReplaced(HttpSessionBindingEvent sbe)


}
