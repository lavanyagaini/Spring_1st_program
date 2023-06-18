package springday1A1first;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Driver {

	public static void main(String[] args) {
		
		
		//resource is interface
		Resource resource=new ClassPathResource("mobile.xml");
		//BeanFactory is also a interface
		BeanFactory bf=new XmlBeanFactory(resource);
		Mobile mobile=(Mobile) bf.getBean("mobile");
		mobile.user();

	}

}
