package largestarray;
import java.util.Scanner;

public class MatrixMultiplication {
	
	public static int[][] matrixMultiply(int[][] firstMatrix, int[][] secondMatrix){
		int r1 = firstMatrix.length;
		//int c1 = firstMatrix[0].length;
		int r2 = secondMatrix.length;
		int c2 = secondMatrix[0].length;
		
		int[][] product = new int[r1][c2];
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<r2; k++) {
					product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
				}
			}
		}
		return product;
	}
	
	public static void display(int[][] matrix) {
		for(int[] row: matrix) {
			for(int col: row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns in first matrix:");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();
		int firstMatrix[][] = new int[row1][col1];
		System.out.println("Enter elements of first matrix:");
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col1; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter number of rows and columns in Second matrix:");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();
		
		if(col1 != row2) {
			System.out.println("Matrix multiplication is not possible.");
		}
		
		int secondMatrix[][] = new int[row2][col2];
		System.out.println("Enter elements of second matrix:");
		for(int i=0; i<row2; i++) {
			for(int j=0; j<col2; j++) {
				secondMatrix[i][j] = sc.nextInt();
			}
		}
		
		int resultantMatrix[][] = matrixMultiply(firstMatrix, secondMatrix);
		System.out.println("Resultant Matrix is:");
		display(resultantMatrix);
		sc.close();
		
	}

}
