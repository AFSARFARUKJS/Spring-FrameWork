package spclass;

import java.util.*;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterInjectionWithMap {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("spclass/springconfig.xml");
		BeanFactory b = new XmlBeanFactory(r);
		SetterWithMap sm = (SetterWithMap)b.getBean("s4");
		Map<String,String> ms = sm.getM();
		Set<String> st = ms.keySet();
		Iterator<String> ite = st.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			String value = ms.get(key);
			
			System.out.println("Key : " + key +"\t" + "Value : " + value + "\t");
		}
	}
}
