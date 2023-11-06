import java.util.Scanner;
class Six{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A Number : ");
		int n=sc.nextInt();
		if(isPerfectSquare(n))
			System.out.println("The Number is Perfect Square.");
		else{
			System.out.println("Not Perfect Square");
		}

	}


	public static boolean isPerfectSquare(int x){
		for(int i=1;i<=x;i++){
			if(i*i==x)
				return true;

		}
		return false;
	}
}