import java.util.Scanner;
class Six{
	public static void main(String[] args) {
		int guessNumber=1+(int)(Math.random()*100);
		Scanner sc=new Scanner(System.in);
		int input=0;
		System.out.println("*** please Enter 1 to 100  ***");
		for(int i=1;i<=6;i++){
			System.out.println(i+"Chance");
			input=sc.nextInt();
			if(input==guessNumber){
				System.out.println("Congratulation Your guess is correct");
				break;
			}
			else{
				if (input>guessNumber) {
					System.out.println("your guess is high");
					continue;
				}
				else{
					System.out.println("your guess is low");
					continue;
				}
			}
		}
		System.out.println("Better luck next time");
	}
}