package dependencyInjection;

public class Customer {

	//dependency
	//the service object
	//Service service =new Service("cool service");
	
	
	
	
	private Service service;




	public Customer(Service service) {
		this.service = service;
	}




	//with the above service object we create a method
	public String viewCustomerService() {
		
		System.out.println(service.getName());
		return service.getName();
		
	}
}
