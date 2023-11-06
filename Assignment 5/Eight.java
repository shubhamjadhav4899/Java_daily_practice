class Eight{
	public static void main(String[] args) {
		int i,j,k;
		for( i=0;i<=5;i++){
			if(i==5)
				continue;
			else{
				for( k=4;k>=i;k--)
				System.out.print(" ");
			for( j=0;j<=i;j++)
				System.out.print(" *");
			}
		System.out.println();

		}
		for( i=0;i<=5;i++){
			for( k=0;k<=i;k++)
				System.out.print(" ");
			for( j=5;j>=i;j--)
				System.out.print("* ");
		System.out.println();

		}
	}
}

// Pattern using number
/*class Eight{
	public static void main(String[] args) {
		int i,j,k;
		int count=0;
		for( i=0;i<=5;i++){
			if(i==5)
				continue;
			else{
				for( k=4;k>=i;k--)
				System.out.print(" ");
			for( j=0;j<=i;j++)
				System.out.print(" "+count);
			}
			count++;
		System.out.println();

		}
		
		for( i=0;i<=5;i++){
			for( k=0;k<=i;k++)
				System.out.print(" ");
			for( j=5;j>=i;j--)
				System.out.print(count+" ");
			count--;
		System.out.println();

		}
	}
}*/