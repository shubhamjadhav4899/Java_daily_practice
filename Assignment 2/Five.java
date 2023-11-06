class Five{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		if((n%2!=0&&n%3!=0&&n>1)||n==2){
			System.out.println("Prime Number");
		}
		else{
			System.out.println("Not Prime");
		}
	}
}