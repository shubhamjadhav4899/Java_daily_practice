class Five{
	//Function to make array in sorted order
	void sortArray(int[] arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int minIdex=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[i]){
					minIdex=j;
				}

			}
			int temp=arr[i];
			arr[i]=arr[minIdex];
			arr[minIdex]=temp;
			
		}
	}

	// Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public static void main(String[] args) {
		Five f=new Five();
		int[] arr={11,33,22,32,55,4};
		f.sortArray(arr);
		System.out.println("Sorted array");
        f.printArray(arr);
		
		
	}
}