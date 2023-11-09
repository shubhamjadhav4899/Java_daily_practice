class Employee extends Person{

	private int empNo;
	private String department;
	private double salary;

	public void setData(String name,long phoneNo,String email,int empNo,String department,double salary){
		this.name=name;
		this.phoneNo=phoneNo;
		this.email=email;
		this.empNo=empNo;
		this.department=department;
		this.salary=salary;
	}
	public void getData(){
		super.getData();
		System.out.println("Employee No : "+empNo);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);


	}


}