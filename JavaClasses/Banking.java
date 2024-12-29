package lab2;
import java.util.*;

public class Banking {
	String accountName;
	String accountType;
	//String transactionType;
	long balance;
	static int accounts=0;
	
//	Banking(){
//		accounts++;
//	}
	
	//Parameterized constructor
	Banking(String accountName, String accountType, long balance){
		this.accountName = accountName;
		this.accountType = accountType;
		this.balance = balance;
		accounts++;
	}
	
	//No argument constructor
	//default and no argument constructors cannot coexist
	Banking(){
		this.accountType = "Savings";
		this.balance = 0;
		accounts++;
	}
	
	//constructors can be overloaded with different number of parameters or different datatypes
	//they do not depend on return type
	Banking(String accountName){
		this.accountName = accountName;
		accounts++;
	}
	
	Banking(String name, long balance){
		this.accountName = name;
		this.balance = balance;
		accounts++;
	}
	
	void debit(long amount, String type) {
		if(balance >= amount) {
			System.out.println("The amount "+ amount +" is debited from "+ accountName+" using the transaction type: "+type);
			balance = balance - amount;
			System.out.println("New balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}else {
			System.out.println("Insufficient balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
	}
	
	void debit(long amount) {
		if(balance >= amount) {
			System.out.println("The amount "+ amount +" is debited from "+ accountName);
			balance = balance - amount;
			System.out.println("New balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}else {
			System.out.println("Insufficient balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
	}
	
	void deposit(int amount) {
		balance += amount;
		System.out.println("Amount deposited: "+ amount);
		System.out.println("New balance: "+balance);
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
	
	void deposit(int amount, String type) {
		Scanner sc = new Scanner(System.in);
		if(type.toLowerCase() == "cheque") {
			System.out.println("Enter the cheque number");
			int chequeNo = sc.nextInt();
			balance += amount;
			System.out.println("Amount deposited: "+amount+" using "+type+" transaction. "+"Cheque no: "+chequeNo);
			System.out.println("New balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		else {
			balance += amount;
			System.out.println("Amount deposited: "+amount+" using "+type+" transaction.");
			System.out.println("New balance: "+balance);
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		sc.close();
	}
	
	static void displayCount() {
		System.out.println("Total number of accounts: "+accounts);
	}
	
	public static void main(String[] args) {
		Banking acc4 = new Banking("OnlyName");
		Banking acc1 = new Banking("abhi",10);
		Banking acc2 = new Banking("ram","Savings",100);
		Banking acc3 = new Banking();
		
		acc1.deposit(10);
		acc2.deposit(10,"CASH");
		acc2.debit(10);
		acc2.debit(20,"RTGS");
		
		displayCount();
		
	}
}
