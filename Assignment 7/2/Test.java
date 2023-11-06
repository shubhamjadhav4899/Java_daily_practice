class Test{
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("Shubham");
		Person p3=new Person("Amit",20);
		Person p4=new Person("Raju","India",21);
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4.getCountry());

	}
}