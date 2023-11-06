class Seven{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int mul=1;
		while(n>0){
			int number=n%10;
			mul=mul*number;
			n=n/10;
		}

		System.out.println("Multiplication of the given digit is  : "+mul);
	}
}