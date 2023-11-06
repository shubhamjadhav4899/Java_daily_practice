class Three{
	public static void main(String[] args){
		String str=args[0];
		if(str.length()>0 && str.length()<2){
			char ch=str.charAt(0);
			if (ch=='A'||ch=='E'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("charecter is vowel");
		}
		else{
			System.out.println("charecter is consonant");
		}
		}
		else{
			System.out.println("Please Enter only one charecter.");
		}
		
	}
}