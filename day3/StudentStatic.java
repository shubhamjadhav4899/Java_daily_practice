class StudentStatic{
	public static void main(String[] args){
		Student student=new Student(1,"aaa");
		student.course="Python";

		System.out.println(student.name+" "+Student.course);
		Student.display();
		Student.displayOne();	
	}
}