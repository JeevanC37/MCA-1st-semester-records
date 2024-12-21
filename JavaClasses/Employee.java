package employee;

public class Employee {
	int id;                   //Instances of class
	String name;
	int salary;
	static String department = "R&D";     //static variable
	
	Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee(25, "Jeevan", 60000);
		int sum = e.salary * 12;  //local variable
		System.out.println("id:"+e.id+"\n"+"name:"+e.name+"\n"+"salary:"+sum+"\n"+"department:"+department);
	}

}
