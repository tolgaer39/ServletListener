package _01_ServletContextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImp2 implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
		System.out.println("context destroyed2");
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		
		//Proje ilk ayaga kalkerken bir seyler yapmak istersek buraya yaziyoruz...
		
		System.out.println("context initalized2");		
	}

}
