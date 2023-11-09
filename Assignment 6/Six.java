class Six{
	public static void main(String[] args) {
		int[] arr={12,2,33,4,5,3,22,4,4,55};
		int n=arr.length-1;
		int sum=0;
		for(int i=0;i<=n;i++){
			if(i%2==1||i%3==1)
				sum+=arr[i]*arr[i];
		}
		System.out.println("The sum of Square of odd Index Value is : "+sum);
	}
}