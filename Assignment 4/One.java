import java.util.Scanner;

class One{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//Getting the input form user
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		//if condition is true or false in that function return below output;
		if(isArmstrong(n)){
			System.out.println("The Number is Armstrong");
		}
		else{
			System.out.println("Not Armstrong");
		}

	}
	public static boolean isArmstrong(int number){
		//Sum of all the cube of digit 
		int sumOfAll=0;
		//finding the cube 
		int res=0;
		//making a copy of orginal value
		int compareValue=number;
		//reunning a while loop to find particular digit
		while(number>0){
			res=1;
			int num=number%10;
			for(int i=1;i<3;i++){
			res=num*num;
			res=num*res;
		}
		//adding cube of each digit 
		sumOfAll+=res;
		//removing that digit
		number=number/10;
		}
		//condition for checing sum is equal it's original value
		return sumOfAll==compareValue;
	}
}