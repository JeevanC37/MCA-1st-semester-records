package student;
import java.util.*;
/*    */   //multi-line comments
public class Student {
	int age=22;   //they are instance variables
	String name="abc";
	static int marks=100;
	
	void display() {
		System.out.println("method content" + marks);
	}{
		int i=10;   //local variable
		System.out.println(i);   //you can create a method without specifying access modifier,return type,class
	}
	
	String display1() {
		return "string method";
	}
	public static void main(String[] args) {
		Student s1 = new Student();    
		Scanner sc = new Scanner(System.in);
		s1.name = sc.next();
		s1.age = sc.nextInt();
		System.out.println("Name:"+ s1.name +"\n"+ "age:"+ s1.age + "\n" + "marks:"+ marks);
		s1.display();
		marks = 200;
		System.out.println(marks);
		s1.display1();    //it won't print bcz there is no var which receives it
		String s2 = s1.display1();
		System.out.println(s2);
		sc.close();
	}
	
}
