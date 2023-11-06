class Launch{
	public static void main(String[] args) {
		Person person=new Person();

		person.setData("John",1234567890,"John@gmail.com");
		System.out.println("Person data");
		person.getData();
		System.out.println("Employee Details");

		Employee employee =new Employee();
		employee.setData(0001,"Customer",50000.00);

		//subclass access all pu
		employee.name="John";
		employee.email="John@gmail.com";
		employee.phoneNo=1234567890;
		System.out.println("Employee data");
		employee.getData();

	}
}