class Nine{
	public static void main(String[] args){
		float num=Float.parseFloat(args[0]);
		double hra,da;
		if(num>0&&num<=10000){
			da=num*80/100;
			hra=num*20/100;
			System.out.println("HRA(House Rent Allowance) = "+hra+"\nDA(Dearness Allowance) = "+da);
		}
		else{
			da=num*90/100;
			hra=num*25/100;
			System.out.println("HRA(House Rent Allowance) = "+hra+"\nDA(Dearness Allowance) = "+da);
		}
	}
}