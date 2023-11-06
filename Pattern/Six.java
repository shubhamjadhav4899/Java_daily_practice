class Six{
	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			if(i<5){
				for(int j=5;j>=i;j--)
					System.out.print(" ");
				for(int k=0;k<i;k++)
					System.out.print("* ");
				System.out.println();
			}
			if (i>=5) {
				for(int l=5;l<i;l++)
					System.out.print(" ");
				for(int m=10;m>i;m--)
					System.out.print(" *");
				System.out.println();
			}
		}
	}
}