class Eight{
	public static void main(String[] args){
		int num=Integer.parseInt(args[0]);
		if (num%5==0 && num%11==0) {
			System.out.println("The number is divisible by both 5 And 11");
		}
		else{
			System.out.println("The number is not divisible");
		}
	}
}