package springex;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {

//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);// IOC
	    ApplicationContext context =   
	            new ClassPathXmlApplicationContext("applicationContext.xml");  
	    
	    Controller1 controller1=(Controller1) context.getBean("c1");
		//Controller1 controller1 = (Controller1) factory.getBean("c1");
		controller1.display();
		
		Student s1=(Student) context.getBean("e1");
		s1.show();
	}
}
