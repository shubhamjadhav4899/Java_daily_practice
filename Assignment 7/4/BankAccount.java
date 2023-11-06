class BankAccount{
	int accNo;
	String accType;
	int balence;
	static float intrest;

	static{
		intrest=5;
	}

	BankAccount(int accNo,String accType,int balence){
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
	void withdrawFund(int amount){
		if(amount<=balence){
			balence=balence-amount;
			System.out.println(amount+" Withdraw Succssefully...");
		}
		else
			System.out.println("Insufficient Fund...");
	}
	void depositFund(int amount){
		balence=balence+amount;
		System.out.println(amount+" Deposited Succssefully...");
	}
	void displayBalence(){
		 System.out.println("Balence is : "+balence);
	}
	
}