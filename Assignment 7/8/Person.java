class Person{
	String name;
	int adharId;
	String gender;
	Address addr;

	Person(String name,int adharId,String gender,Address addr){
		this.name=name;
		this.adharId=adharId;
		this.gender=gender;
		this.addr=addr;
	}

	void disaplayDetails(){
		System.out.println("Name : "+name);
		System.out.println("Adhar No : "+adharId);
		System.out.println("Gende : "+gender);
		addr.getAddress();
	}
}