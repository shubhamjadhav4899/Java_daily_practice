class Calculator{
	int one;
	int two;

	//Setters Method
	void addition(int a,int b){
		one=a;
		two=b;
	}

	void substraction(int a,int b){
		one=a;
		two=b;
	}

	void multiplication(int a,int b){
		one=a;
		two=b;
	}

	void modules(int a,int b){
		one=a;
		two=b;
	}
	//Getters Method
	int getAddition(){
		return one+two;
	}

	int getSubstraction(){
		return one-two;
	}

	int getMultiplication(){
		return one*two;
	}

	int getModulus(){
		return one%two;
	}
}