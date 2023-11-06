class Employee extends Person{

	int empNo;
	String department;
	double salary;

	@Override
	void setData(int empNo,String department,double salary){
		this.empNo=empNo;
		this.department=department;
		this.salary=salary;
	}
	@Override
	void getData(){
		super.getData();
		System.out.println("Employee No : "+empNo);
		System.out.println("Department : "+department);
		System.out.println("Salary : "+salary);


	}


}