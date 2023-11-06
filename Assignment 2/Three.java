class Three{
	public static void main(String[] args){
		int number=Integer.parseInt(args[0]);
		int count=number*10;
		for(int i=number;i<=count;i++){
			if(i%number==0){
				System.out.println(i);
			}
			else{
				continue;
			}
		}
	}
}