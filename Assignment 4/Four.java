class Four{
	public static void main(String[] args) {
		int num1=120;
		int num2=40;
		int maxDivisor=0;
		int highestNumber=num1>num2?num1:num2;
		for(int i=1;i<highestNumber;i++){
			if(num1%i==0&&num2%i==0){
				maxDivisor=i;
			}
		}
		System.out.println("Highest common divisor is : "+maxDivisor);
	}
}