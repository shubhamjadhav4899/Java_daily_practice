class Four{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
	int n=arr.length;
	int count=0;
	for(int i=n-1;i>=0;i--){
		int temp=arr[i];
		arr[i]=arr[count];
		count++;
	}
	System.out.print("The Array is : ");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	}

}