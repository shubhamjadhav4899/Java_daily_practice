class BankAccount{
	static int accNo;
	static String accType;
	static double balence;
	static double intrest;

	static{
		intrest=0.07;
	}

	BankAccount(int accNo,String accType,double balence){
		this.accNo=accNo;
		this.accType=accType;
		this.balence=balence;
	}
	void displayDetails(){
		System.out.println("Account Number : "+accNo);
		System.out.println("Account Type : "+accType);
		System.out.println("Account Balence : "+balence);
		System.out.println("Intrest rate : "+intrest);

	}
	void withdrawFund(double amount){
		if(amount<=balence){
			balence=balence-amount;
			System.out.println(amount+" Withdraw Succssefully...");
		}
		else
			System.out.println("Insufficient Fund...");
	}
	 void depositFund(double amount){
		balence=balence+amount;
		System.out.println(amount+" Deposited Succssefully...");
	}
	 void displayBalence(){
		 System.out.println("Balence is : "+balence);
	}

	//Intrest amount calculation
	static double intrestAmount(){
		double intrestAmount=intrest*balence;
		balence=balence+intrestAmount;
		return intrestAmount;

	}
	
}