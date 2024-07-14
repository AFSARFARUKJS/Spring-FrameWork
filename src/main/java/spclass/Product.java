package spclass;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class Product {

	private String prod_id , prod_name , department;
	private double price;
	private DriverManagerDataSource db = null;
	private LocalSessionFactoryBean lsession = null;
	private HibernateTransactionManager hm = null;
	private HibernateTemplate ht = null;

	public Product(String prod_id, String prod_name, String department , double price) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.department = department;
		this.price = price;
	}
	
	public void displayProduct() {
		
		System.out.println("Product ID : " + prod_id);
		System.out.println("Product Name : " + prod_name);
		System.out.println("Department : " + department);
		System.out.println("Price : " + price);
	}
}
