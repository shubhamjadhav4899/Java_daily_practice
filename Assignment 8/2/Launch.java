class Launch{
	public static void main(String[] args) {
		Person person=new Person();

		person.setData("John",1234567890,"John@gmail.com");
		System.out.println("Person data");
		person.getData();
		

		Employee employee =new Employee();
		employee.setData("John",1234567890,"John@gmail.com",0001,"Customer",50000.00);

		//subclass access all pu
		System.out.println("Employee data");
		employee.getData();

	}
}