class Four{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int sum=0;
		//for loop for i is less than input
		for(int i=1;i<n;i++){
			//condition to check it divisible or not If it divisible add to the sum variable .
			if(n%i==0){
				sum+=i;
			}
		}
		//condition to check sum variable equal to input given by user
		if(n==sum){
			System.out.println("The Number is Natural.");
		}
		//not natural no print this.
		else{
			System.out.println("The Number is not Natural.");
		}
	}