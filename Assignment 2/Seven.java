class Seven{
	public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		String original=Integer.toString(n);
		String reversed="";
		//for revering the string
		for(int i=original.length()-1;i>=0;i--){
			reversed += original.charAt(i);
		}
		if(original.equals(reversed)){
			System.out.println("The Number is palindrome .");
		}
		else{
			System.out.println("Not palindrome");
		}
	}
}