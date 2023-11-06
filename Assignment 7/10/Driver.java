import java.util.Scanner;
class Driver{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll No :");
		int roll=sc.nextInt();
		System.out.print("Enter Name : ");
		String name=sc.next();
		System.out.print("Enter Age : ");
		int a=sc.nextInt();
		Student studentOne=new Student();
		studentOne.setData(1,"shubham",23);
		studentOne.getData();
		Student studentTwo=new Student();
		studentTwo.setData(roll,name,a);
		studentTwo.getData();
	}
}