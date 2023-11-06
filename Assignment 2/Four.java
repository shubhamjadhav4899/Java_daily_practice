class Four{
	public static void main(String[] args){
		int num=Integer.parseInt(args[0]);
		int factorial=1;
		int count;
		for (int i=1;i<=num;i++){
			factorial=factorial*i;
		}
		System.out.println("The Factorial is : "+factorial);
	}
}