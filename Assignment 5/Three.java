import java.util.Scanner;
class Three{
	public static void main(String[] args) {
		System.out.print("Enter a String : ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String convertLower=str.toLowerCase();
		int n=str.length();
		
		if(pangramCheck( convertLower, n))
			System.out.println("String is Pangram.");
		else
			System.out.println("Not Pangram");
	}

	public static boolean pangramCheck(String str,int n){
		boolean[] alphabetPrsent=new boolean[26];
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(Character.isLetter(c)){
				int index=c-'a';
				alphabetPrsent[index]=true;
			}
		}
		for(int i=0;i<26;i++){
			if(!alphabetPrsent[i])
				return false;
		}
		return true;

	}
}