package _02_ServletContextAttributeListener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletContextAttributeListenerImp implements ServletContextAttributeListener{

	@Override
	public void attributeAdded(ServletContextAttributeEvent sca) {
		System.out.println("attribute added" + sca.getName()+" "+sca.getValue());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent sca) {
		System.out.println("attribute removed" + sca.getName()+" "+sca.getValue());
	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent sca) {
		System.out.println("attribute replaced" + sca.getName()+" "+sca.getValue());
	}

}
