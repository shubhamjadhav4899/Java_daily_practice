class Four{
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8,9};
	int n=arr.length;
	int mid=n/2;
	int count=0;
	int size=n-1;
	while(count<=mid){
		int temp=arr[count];
		arr[count]=arr[size];
		arr[size]=temp;
		count++;
		size--;
	}
	System.out.print("The Array is : ");
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	}

}