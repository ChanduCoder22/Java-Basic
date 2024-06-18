import java.util.Scanner;

public class IntegerToRoman {
	public String intToRoman(int num) {
// 4. Your logic here
		String M[] = { "", "M", "MM", "MMM" };
		String C[] = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String X[] = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String I[] = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		return M[num / 1000] + 
				   C[(num % 1000) / 100] + 
				   X[(num % 100) / 10] + 
				   I[num % 10];
	}

	public static void main(String[] args) {
// 1. Initialize your variables or objects
		Scanner sc = new Scanner(System.in);
		IntegerToRoman obj = new IntegerToRoman();
// 2. Take user Input
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
// 3. Call method intToRoman
		System.out.println("Roman number is: " + obj.intToRoman(num));
	}
}