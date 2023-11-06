import java.util.Scanner;
class Three{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={33,11,55,22,4,5,66,43,33};
		int n=arr.length;
		System.out.print("Please Enter A Number : ");
		int num=sc.nextInt();
		int i=0;
		int count=0;
		while(i<n){

			if(num==arr[i]){
				System.out.println("Found at index "+i+" Element "+arr[i]);
				count++;
			}
			i++;
		}
		System.out.println("Total "+count+" Similar element present in the array");

	}
}