import java.util.Scanner;

class Employee{
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary(){
		return this.salary;
	}
}

class Labour extends Employee{
	private double overtime;

	public Labour(int id, String name, double salary, double overtime){
		super(id,name,salary);
		this.overtime = overtime;
	}

	public double getSalary(){
		return (this.overtime + super.getSalary());
	}
}

class Manager extends Employee{
	private double incentive;

	public Manager(int id, String name, double salary, double incentive){
		super(id,name,salary);
		this.incentive = incentive;
	}

	public double getSalary(){
		return (this.incentive + super.getSalary());
	}
}

public class EmployeeTest{
	public static double getTotalSalary(Employee emp[]){
		double total = 0;
		for(int i = 0; i < emp.length; i++){
			total += emp[i].getSalary();
		}
		return total;
	}

	public static void main(String args[]){
		int id; String name; double salary,overtime,incentive;
		System.out.println("Enter number of employees");
		Scanner scan = new Scanner(System.in);
		int noOfEmployees = scan.nextInt();
		Employee emp[] = new Employee[noOfEmployees];
		
		for(int i = 0; i < noOfEmployees; i++){
			System.out.println("Press 1 for Labour, 2 for Manager");
			int choice = scan.nextInt();
			if(choice == 1){
				System.out.println("Enter ID");
				id = scan.nextInt();
				System.out.println("Enter name");
				name = scan.next();
				System.out.println("Enter salary");
				salary = scan.nextDouble();
				System.out.println("Enter overtime");
				overtime = scan.nextDouble();
				emp[i] = new Labour(id,name,salary,overtime);
			}
			else if(choice == 2){
				System.out.println("Enter ID");
				id = scan.nextInt();
				System.out.println("Enter name");
				name = scan.next();
				System.out.println("Enter salary");
				salary = scan.nextDouble();
				System.out.println("Enter incentive");
				incentive = scan.nextDouble();
				emp[i] = new Manager(id,name,salary,incentive);
			}
		}

		double totalSalary = getTotalSalary(emp);
		System.out.println("Total Salary: "+totalSalary);
	}
}