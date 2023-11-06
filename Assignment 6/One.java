class One{
	public static void main(String[] args) {
		//initlization of the array
		int[] arr={1,2,3,3,4,5};
		//the variable initlization of 0 getting sum
		int sum=0;
		//for each loop for getting value in the array
		for(int x:arr)
			sum+=x;
		int avg=sum/arr.length;
		System.out.println("The Sum of the Array is : "+sum);
		System.out.println("The Average of the Array is : "+avg);

	}
}