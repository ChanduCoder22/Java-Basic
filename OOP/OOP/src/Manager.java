
public class Manager extends Employee {
	int teamSize;
	Manager(int id, String name, String job, float salary, int teamSize){
		super(id, name, job, salary);
		this.teamSize = teamSize;
	}
	void manageTeam() {
		System.out.println(" I am manager handles "+ teamSize + " employees");
	}
	void computeHra() {
		hra = salary * 0.4f;
	}
}
