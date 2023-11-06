class Four{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
	int n=arr.length;
	for(int i=n-1;i>=0;i--){
		arr+=arr[i];
	}
	System.out.println(arr);
	}

}