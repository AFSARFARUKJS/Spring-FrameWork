package spclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorWithList {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		QuestionAndAnswer1 qa = (QuestionAndAnswer1)b.getBean("c3");
		qa.show();
	}
}
