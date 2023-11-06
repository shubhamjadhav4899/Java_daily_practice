class Five{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		
			if(num!=0){
				if(num%2==0){
				System.out.println("Number is even");
			}
			else{
				System.out.println("Number is odd");
			}
			}
			else{
				System.out.println("This input not acceptable !");
			}
		}
		
}