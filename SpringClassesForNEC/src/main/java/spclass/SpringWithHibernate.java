package spclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringWithHibernate {

	public static void main(String[] args) {
		
		Department department = new Department();
		department.setDept_id("dept-1");
		//department.setDept_name("ECE");
		//department.setDept_head("abc");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spclass/springconfig.xml");
		NandhaDAO nd = (NandhaDAO)ac.getBean("sp5");
		//nd.storeData(department);
		//nd.updateData(department);
		nd.deleteData(department);
	}
}
