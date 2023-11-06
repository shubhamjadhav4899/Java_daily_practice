class Student{
	int rollNo;
	String name;
	static String course="Java";
	Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name=name;
	}
	static void display(){
		System.out.println("Staic Method");
	}
	static void displayOne(){
		System.out.println("Non Static Method");
	}

}