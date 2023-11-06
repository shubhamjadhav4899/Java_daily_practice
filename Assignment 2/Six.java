class Six{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int count=0;
		//Condition checking for if input is in +ve
		if(n<=0){
			System.out.println("Please Enter a Positive no");
		}
		else{
            System.out.println("Fibonacci series up to " + n + " terms:");
			int a=0;
			int b=1;
			if(n>=1){
				System.out.print(a);
			}
			if(n>=2){
				System.out.print(" "+b);
				a=b;
			}
			for(int i=3;i<=n;i++){
				int next =a+b;
				System.out.print(" "+next);
				a=b;
				b=next;
			}
		}
	}
}