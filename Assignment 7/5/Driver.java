class Driver{
	public static void main(String[] args) {
		BankAccount ac1=new BankAccount(12345,"saving",50000);
		ac1.withdrawFund(1000);
		ac1.depositFund(2000);
		System.out.println("Balence Before Intrest Added");
		ac1.displayDetails();
		System.out.println("Balence After Intrest Added");
		//Staic method
		BankAccount.intrestAmount();
		ac1.displayDetails();

	}
}