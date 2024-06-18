import java.util.Scanner;

public class MainAdder {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Adder adder = new Adder();//Invokes default constructor
		adder.add(10, 20);
		adder.add(10.5f, 20.0f);
		adder.add(10, 20, 30);
		adder.add(10, 20);
		adder.add(10.69f, 56);
	}

}
