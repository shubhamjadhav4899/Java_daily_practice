class Person{
	String name;
	int age;
	String country;
	//Default constructor
	Person(){
		System.out.println("default constructor");
	}
	//parmeterized constructor also constructor overloading is there.

	Person(String n){
		name=n;
	}
	Person(String s,int a){
		name=s;
		age=a;
	}
	Person(String s,String c,int a){
		name=s;
		country=c;
		age=a;
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