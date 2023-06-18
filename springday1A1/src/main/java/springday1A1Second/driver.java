package springday1A1Second;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springday1A1first.Mobile;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource res= new ClassPathResource("mobile.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Mobile1 mobile=(Mobile1) factory.getBean("mobile1");
		mobile.used();
		
	}

}
