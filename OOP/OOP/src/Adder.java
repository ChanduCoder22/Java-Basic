
public class Adder {
	// Method Overloading - Static polymorphism
	void add(int n1, int n2) {
		int sum;
		sum = n1 + n2;
		System.out.println("Sum of 2 int values " + sum);
	}
	
	void add(float n1, float n2) {
		float sum;
		sum = n1 + n2;
		System.out.println("Sum of 2 float values " + sum);
	}
	void add(int n1, int n2, int n3) {
		int sum;
		sum = n1 + n2 + n3;
		System.out.println("Sum of 3 int values " + sum);
	}

	void add(float n1, int n2) {
		float sum;
		sum = n1 + n2;
		System.out.println("Sum of 1 float and 1 int values " + sum);
	}
}
