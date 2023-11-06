class Driver{
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.addition(4,5);
		calc.substraction(10,2);
		calc.multiplication(10,2);
		calc.modules(6,5);
		System.out.println("Addition is : "+calc.getAddition());
		System.out.println("Substraction is : "+calc.getSubstraction());
		System.out.println("Division is : "+calc.getMultiplication());
		System.out.println("Modulus is : "+calc.getModulus());

	}
}