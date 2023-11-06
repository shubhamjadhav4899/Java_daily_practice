class Ten{
	public static void main(String[] args){
		int tax;
		int income=Integer.parseInt(args[0]);
		if(income>250000){
			if(income<=500000){
				tax=income*5/100;
			}
			else if(income>500000 && income<=1000000){
				tax=income*10/100;
			}
			else{
				tax=income*15/100;
			}
		}
		else tax=0;
		System.out.println("Tax : "+ tax);
	}
}