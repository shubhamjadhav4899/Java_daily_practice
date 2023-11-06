class Student{
	private String name;
	private int rollNo;
	private char grade;

	//Setters for the private instance data member.
	public void setName(String name){
		this.name=name;
	}

	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}

	public void setGrade(char grade){
		this.grade=grade;
	}

	//Getters

	public String getName(){
		return name;
	}

	public int getrollNo(){
		return rollNo;
	}

	public char getGrade(){
		return grade;
	}

	public void displayData(){
		System.out.println("Name : "+getName());
		System.out.println("Roll No : "+getrollNo());
		System.out.println("Grade : "+getGrade());
	}

}