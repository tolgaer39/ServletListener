package _01_ServletContextListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImp3 implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
		System.out.println("context destroyed3");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		//Proje ilk ayaga kalkerken bir seyler yapmak istersek buraya yaziyoruz...
		
		System.out.println("context initalized3");		
	}

}
