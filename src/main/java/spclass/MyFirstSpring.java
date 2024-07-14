package spclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyFirstSpring {

	public static void main(String[] args) {
		
		/*Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r); */
		
		ApplicationContext b = new ClassPathXmlApplicationContext("spclass/springconfig.xml");
		Book book = (Book)b.getBean("s1");
		
		
		System.out.println("Book ID : " + book.getBook_id());
		System.out.println("Book Name : " + book.getBook_name());
		System.out.println("Author : " + book.getAuthor());
		
		
	}
}
