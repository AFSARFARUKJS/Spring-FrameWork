package spclass;

public class Customer {

	private String cust_id , cust_name;
	private Product p;
	
	public Customer(String cust_id, String cust_name, Product p) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.p = p;
	}
	
	public void displayCustomerData() {
		
		System.out.println("Customer ID : " + cust_id);
		System.out.println("Customer Name : " + cust_name);
		p.displayProduct();
	}
	
	
}
