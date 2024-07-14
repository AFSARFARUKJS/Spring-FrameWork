package spclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Product product = (Product)b.getBean("c1");
		product.displayProduct();
	}
}
