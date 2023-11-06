import java.util.Scanner;
class Pattern{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		for (int i=0;i<=n;i++){
			System.out.println();
			for(int k=space;k>=0;k--)
				System.out.print(" ");
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			space--;
		}
	}
}