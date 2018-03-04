package dependencyInjection;

public class App {
public static void main(String[] args) {
 
	Service s1 = new Service("cool service");
	Service s2 = new Service("lame service");
	Service s3 = new Service("mediocre service");
	
 Customer c = new Customer(s3);
 c.viewCustomerService();
 
 Customer c1 = new Customer(s2);
 c1.viewCustomerService();
 
 Customer c2 = new Customer(s1);
 c2.viewCustomerService();
 
}
}