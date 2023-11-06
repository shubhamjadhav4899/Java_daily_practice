import java.util.Scanner;
class Five{
	public static void main(String[] args) {
		System.out.print("Pleasr Enter A String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(isPalindrome(str)){
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is Not palindrome");
		}
	}

	public static boolean isPalindrome(String str){
		int n=str.length()-1;
		String reversed="";
		for(int i=n;i>=0;i--){
			reversed+=str.charAt(i);
		}
		if(str.equals(reversed))
			return true;
		return false;
	}
}