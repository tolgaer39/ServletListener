package _03_ServletRequestListener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServletRequestAttributeListenerImp implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent srae) {
		System.out.println("reqattributedAdded eklendi" + srae.getName()+" "+srae.getValue() );
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent srae) {
		System.out.println("reqremoved eklendi" + srae.getName()+" "+srae.getValue() );
		
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent srae) {
		System.out.println("reqreplaced eklendi" + srae.getName()+" "+srae.getValue() );
	}

}
