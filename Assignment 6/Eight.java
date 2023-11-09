class Eight{
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



	public static void main(String[] args) {
		Eight e=new Eight();
		int number=2;
		int[] arr={11,33,22,32,55,4,99};
		e.sortArray(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n"+number+" Largest element in the Array is : "+arr[number-1]);
		System.out.println(number+" Smallest element in the Array is : "+arr[arr.length-number]);

		
		
	}
}