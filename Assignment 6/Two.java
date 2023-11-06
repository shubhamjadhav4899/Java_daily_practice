
class Two{
	public static void main(String[] args) {
		int[] arr={20,50,33,44,5,77,22};
		int n=arr.length;
		if(n==1){
			System.out.println("max Array Element : "+arr[0]);
			System.out.println("Min Array Element : "+arr[0]);

		}
		if(n==2){
			if(arr[0]>arr[1]){
				System.out.println("Min Array Element : "+arr[1]);
				System.out.println("max Array Element : "+arr[0]);
			}
			else{
				System.out.println("Min Array Element : "+arr[0]);
				System.out.println("max Array Element : "+arr[1]);
			}
		}
		int i=0;
		while(i<n-1){
			if(arr[i]>arr[i+1]){
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			i++;
		}
		

		System.out.println("Minimum Element in the Array is : "+arr[0]);
		System.out.println("Maximum Element in the Array is : "+arr[n-1]);


	}


}