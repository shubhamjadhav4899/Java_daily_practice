class Student{
	private int rollNo;
	private String name;
	private int age;

	public void setData(int roll,String Name,int a){
		rollNo=roll;
		name=Name;
		age=a;
	}

	public void getData(){
		System.out.println("Roll No : " + rollNo);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}


}