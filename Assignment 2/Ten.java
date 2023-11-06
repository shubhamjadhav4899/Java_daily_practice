class Ten{
	public static void main(String[] args){
		int res=0;
		for(int i=1;i<=50;i++){
			if(i%2==0){
				res+=i;
			}
		}
		System.out.println("The sum of all even Number : "+res);
	}
}