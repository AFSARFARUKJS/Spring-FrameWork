package spclass;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DependencyInjection {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		Library lib = (Library)b.getBean("s2");
		
		System.out.println("Library ID : " + lib.getLib_id());
		System.out.println("Library Name : " + lib.getLib_name());
		Book book = lib.getB();
		System.out.println("Book ID : " + book.getBook_id());
		System.out.println("Book Name : " + book.getBook_name());
		System.out.println("Author : " + book.getAuthor());
	}
}
