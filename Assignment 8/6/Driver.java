class Driver{
	public static void main(String[] args) {
		Employee employee =new Employee("Smith",28,"987654312","Pune,India",20000.000);
		Manager manager=new Manager("Alexander",30,"9833445577","Pune,India",50000.000);
		System.out.println("Employee Salary : "+employee.printSalary());
		System.out.println("Manager Salary : "+manager.printSalary());
	}
}