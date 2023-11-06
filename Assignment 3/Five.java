class Five{
	public static void main(String[] args){
		/*for loop for loop at starting ascii value to end value here we have considered 
		we know the range of the value so we are reunning the loop between range.*/
		for(int i=65;i<=90;i++){
			//Typecast the integer into charecter.
			char ch=(char)i;
			//printing the charecter with its ascii value
			System.out.println("Charecter : "+ch+ " ASCII :"+i);
		}
	}
}