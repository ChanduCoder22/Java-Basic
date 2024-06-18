public class Employee {
	int id;
	String name;
	String job;
	float salary,hra;
	Employee(int id, String name, String job, float salary){
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;
	}
	void showDetails() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Job : " + job);
		System.out.println("Salary : " + salary);
		System.out.println("HRA : " + hra);
	}
	void computeHra() {
		hra = salary * 0.2f;
	}
}
