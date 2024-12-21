package calculator;
import java.util.*;


public class Calculator {
	int a,b;
	static int result;
	
	Calculator(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void Addition(int a, int b) {
		result = a + b;
		System.out.println("Addition: "+ result);
	}
	
	public void Subtraction(int a, int b) {
		result = a + b;
		System.out.println("Subtraction: "+result);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your first number: ");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		System.out.println("\nEnter your second number: ");
		int a2 = sc.nextInt();
		
		Calculator c = new Calculator(a1,a2);

		while(true) {
			System.out.println("\n1.Addition");
			System.out.println("2.Subtraction");
			int choice;
			choice = sc.nextInt();
			switch(choice) {
			case 1: 
				c.Addition(a1, a2);
				break;
			case 2:
				c.Subtraction(a1, a2);
				break;
			default:
				System.out.println("Invalid choice");
				sc.close();
				System.exit(0);
			}
		}
		
	}

}
