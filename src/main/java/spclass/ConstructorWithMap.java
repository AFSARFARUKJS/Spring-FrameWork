package spclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorWithMap {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		ConWithMap cm = (ConWithMap)b.getBean("c4");
		cm.showMap();
	}
}
