class Eleven{
	public static void main(String[] args) {
		//initllize the array size 
		int row=3;
		int column=3;
		//the array of size size two with delclaration
		int[][] matrix1={{11,22,22},{22,44,65},{12,54,63}};
		int[][] matrix2={{11,22,22},{22,44,65},{12,54,63}};
		int[][] multiplicationOfMatrixOneAndTwo=new int[row][column];
		int i,j;
		//loop for multiply the two mattrix
		for(i=0;i<matrix1.length;i++){
			for (j=0;j<matrix1[i].length;j++ ) {
				multiplicationOfMatrixOneAndTwo[i][j]=matrix1[i][j]*matrix2[i][j];
			}
		}
		//loop for printing the Multiplication of matrix
		for(i=0;i<matrix1.length;i++){
			for (j=0;j<matrix1[i].length;j++ ) {
				System.out.print(multiplicationOfMatrixOneAndTwo[i][j]+" ");
			}
			System.out.println();
		}


	}
}