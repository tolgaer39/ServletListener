package _01_ServletContextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImp implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("context destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		//Proje ilk ayaga kalkerken bir seyler yapmak istersek buraya yaziyoruz...
		
		System.out.println("context initalized");		
	}

}
