package largestarray;
import java.util.Scanner;

public class LargestArrayNumber {
	
	public static void getLargestNumber(int[] arr) {
		int n = arr.length;
		int Largest = -1, SecondLargest = -1;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>Largest) {
				Largest=arr[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i]>SecondLargest && arr[i]!=Largest) {
				SecondLargest = arr[i];
			}
		}
		System.out.println("The largest number is "+ Largest + " and the second largest number is "+ SecondLargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the numbers in the array: ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		getLargestNumber(arr);
		//System.out.println("The Largest number in the array is: "+getLargestNumber(arr));

	}

}
