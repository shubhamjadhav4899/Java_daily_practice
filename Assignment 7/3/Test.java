class Test{
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("Raju","India",21);
		Person p3=new Person("John","Us",23);
		Test t=new Test();
		p1.compareAge(p2.getAge(),p3.getAge());
		if(p1.compareAge(p2.getAge(),p3.getAge())){
			System.out.println(p2.getName() +" Is older than "+p3.getName());
		}
		else{
			System.out.println(p3.getName() +" Is older than "+p2.getName());
		}

		System.out.println("Name : "+p2.getName());
		System.out.println("Age : "+p2.getAge());
		System.out.println("Country : "+p2.getCountry());
		System.out.println("Name : "+p3.getName());
		System.out.println("Age : "+p3.getAge());
		System.out.println("Country : "+p3.getCountry());
		
	}

	
}
