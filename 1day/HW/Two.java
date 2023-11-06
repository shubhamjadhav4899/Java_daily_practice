class Two{
	public static void main(String[] args){
		int year =Integer.parseInt(args[0]);
		if((year%4==0 && year%100!=0)||(year%100==0)){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not leap year");
		}
	}
}