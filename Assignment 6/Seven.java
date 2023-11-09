class Seven{
	public static void main(String[] args) {
		int[] arr={12,22,3,4,5,66,77,5,3,33};
		int mid=arr.length/2;

		System.out.println("Sum of First Halve is : "+sumOfFirstHalve(arr,mid));
		System.out.println("Sum of First Halve is : "+sumOfSecondHalve(arr,mid));

	}

	public static int sumOfFirstHalve(int[] arr,int mid){
		int sum=0;
		for(int i=0;i<mid;i++){
			sum+=arr[i];
		}

		return sum;
	}
	
	public static int sumOfSecondHalve(int[] arr,int mid){
		int sum=0;
		for(int i=mid;i<arr.length;i++){
			sum+=arr[i];
		}

		return sum;
	}
}