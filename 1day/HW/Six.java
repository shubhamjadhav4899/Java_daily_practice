class Six{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		if(num>0 && num <=100){
			if (num>=60) {
				if(num>=90){
				System.out.println("A");
			}
			if(num>=80&&num<90){
				System.out.println("B");
			}
			if(num>=70 && num<80){
				System.out.println("C");
			}
			if (num>=60 && num <70) {
				System.out.println("D");
			}
			}
			else{
				System.out.println("F");
			}
		}
		else{
			System.out.println("Please Enter number between 1 to 100");
		}
	}
}