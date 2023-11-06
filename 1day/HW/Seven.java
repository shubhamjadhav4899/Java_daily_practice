class Seven{
	public static void main(String[] args){
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		if(num1==num2&&num2==num3){
			System.out.println("Equilateral");
		}
		else if(num1==num2 || num1==num3 ||num2==num3){
			System.out.println("Isosceles");
		}
		else{
			System.out.println("scalence");
		}
	}
}