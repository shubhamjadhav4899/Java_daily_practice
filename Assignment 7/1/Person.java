class Person{
	String name;
	int age;
	String country;
	void setName(String str){
		name=str;
	}
	void setAge(int n){
		age=n;
	}
	void setCountry(String str){
		country=str;
	}
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	String getCountry(){
		return country;
	}

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("shubham");
		p1.setAge(23);
		p1.setCountry("India");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getCountry());

	}

}