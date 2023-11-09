class Person{
	protected String name;
	protected long phoneNo;
	protected String email;
	
	public void setData(String name,long phoneNo,String email){
		this.name=name;
		this.phoneNo=phoneNo;
		this.email=email;
	}

	public void getData(){
		System.out.println("Name : "+name);
		System.out.println("Phone No : "+phoneNo);
		System.out.println("email : "+email);


	}
}