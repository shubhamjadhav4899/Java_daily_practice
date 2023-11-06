class Two{
	public static void main(String[] args){
		//Convert String array into string
		String str=args[0];
		//finding the length of string
		int n=str.length();
		//Store reverse element.
		String reversedString="";
		for(int i=n-1;i>=0;i--){
			reversedString+=str.charAt(i);
		}
		System.out.println("The ReveseString is : "+reversedString);
	}
}