class Driver{
	public static void main(String[] args) {
		BankAccount ac1=new BankAccount(12345,"saving",50000);
		ac1.displayDetails();
		ac1.withdrawFund(1000);
		ac1.depositFund(2000);
		ac1.displayDetails();

	}
}