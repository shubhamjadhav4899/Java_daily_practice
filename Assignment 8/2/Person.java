class Person{
	String name;
	long phoneNo;
	String email;
	
	void setData(String name,long phoneNo,String email){
		this.name=name;
		this.phoneNo=phoneNo;
		this.email=email;
	}

	void getData(){
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phoneNo);
		System.out.println("email : "+email);


	}
}