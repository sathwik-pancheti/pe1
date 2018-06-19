package exercise1;
import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string: ");
		String str = reader.nextLine();
		System.out.println("Reverse of String is: "+display(str));
	}
	
		public static String display(String str) {
		String reverse = "";

		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}
}

