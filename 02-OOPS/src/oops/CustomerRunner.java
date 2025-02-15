package oops;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Sector-14", "Udaipur", "313002");
		Customer customer = new Customer("Deepak", homeAddress);
		
		Address workAddress = new Address("Whitefield", "Bangalore", "560037");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}
}