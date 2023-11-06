class Person{
	String name;
	int age;
	String country;
	//Default constructor
	Person(){
		System.out.println("default constructor");
	}

	Person(String name,String country,int age){
		this.name=name;
		this.country=country;
		this.age=age;
	}

	//Method is compare the age
	boolean compareAge(int a,int b){
		if(a>b)
			return true;
		return false;
	}

	//Method for getting the details 
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
	String getCountry(){
		return country;
	}



}