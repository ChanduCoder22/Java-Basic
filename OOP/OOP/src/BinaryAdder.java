import java.util.Scanner;

public class BinaryAdder {

	
	public static void main(String[] args) {
		// 1. Initialize variables and objects
		String a, b;
		Scanner sc = new Scanner(System.in);
		long binary1, binary2;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Input first binary number: ");
		  binary1 = in.nextLong();
		  System.out.print("Input second binary number: ");
		  binary2 = in.nextLong();

		  while (binary1 != 0 || binary2 != 0) 
		  {
		   sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2);
		   remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2);
		   binary1 = binary1 / 10;
		   binary2 = binary2 / 10;
		   
		  }
		  if (remainder != 0) {
		   sum[i++] = remainder;
		  }
		  --i;
		  System.out.print("Sum of two binary numbers: ");
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }
		   System.out.print("\n");  
		 }
		/*
		 * BinaryAdder obj = new BinaryAdder(); // 2. Take user input of 2 binary
		 * numbers System.out.println("Enter binary number a: "); a = sc.nextLine();
		 * System.out.println("Enter binary number b: "); b = sc.nextLine(); // 3. Call
		 * the method result which returns the sum in binary
		 * System.out.println("Sum in Binary: " + obj.result(a, b));
		 */	
	

	 /* public String result(String a, String b) { // 4. Your Logic here String sum =
	 * "", carrier = "0"; int len = (a.length() >= b.length()) ? a.length() :
	 * b.length(); while (a.length() != b.length()) { if (a.length() > b.length()) {
	 * b = "0" + b; } else if (a.length() < b.length()) { a = "0" + a; } } for (int
	 * i = len - 1; i >= 0; i--) { if (a.charAt(i) == '1' && b.charAt(i) == '1') {
	 * sum = "0" + sum; carrier = "1"; } else if ((a.charAt(i) == '0' && b.charAt(i)
	 * == '1') || (a.charAt(i) == '1' && b.charAt(i) == '0')) { if (carrier == "1")
	 * { sum = "0" + sum; carrier = "1"; } else { sum = "1" + sum; carrier = "0"; }
	 * } else if (a.charAt(i) == '0' && b.charAt(i) == '0') { if (carrier == "1") {
	 * sum = "1" + sum; carrier = "0"; } else { sum = "0" + sum; carrier = "0"; } }
	 * } if (carrier == "1") sum = "1" + sum; return sum; }
	 */
}