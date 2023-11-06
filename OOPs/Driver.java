class Driver{
	public static void main(String[] args) {
		Customer customer=new Customer(1234,"Raju");
		ClassicCustomer classicCustomer=new ClassicCustomer(1234,"raju");
		
		customer.display();
		customer.calculateIntrest();
		System.out.println("*********************");
		classicCustomer.display();
		classicCustomer.calculateIntrest();
		System.out.println("**********************");
		//Achived Run time polymorphism by using upcasting
		customer=classicCustomer;
		customer.display();
		customer.calculateIntrest();
	}
}