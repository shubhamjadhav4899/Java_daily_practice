class Driver{
	public static void main(String[] args) {
		Address addr=new Address(12,"xyz","hyd",413512);
		Person p1=new Person("shubham",1234,"male",addr);

		p1.disaplayDetails();
	}
}