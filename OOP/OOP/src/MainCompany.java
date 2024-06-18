
public class MainCompany {

	public static void main(String[] args) {
		Employee prasad = new Employee(1001,"Vara Prasad","Developer",60000.00f);
		Manager anirudh = new Manager(1002,"Anirudh","Manager",90000.00f,5);
		prasad.computeHra();
		anirudh.computeHra();
		System.out.println("Employee details");
		prasad.showDetails();
		System.out.println("Manager details");
		anirudh.showDetails();
		anirudh.manageTeam();
	}

}
