package exercise1;

import java.util.Scanner;
public class conditioncheck {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Input a no:");
		int n = num.nextInt();
		System.out.print(display(n));
		
	}
		
		public static String display(int n) {
			String output="";
		if (n>20 && n<30 && n%2 == 0) {
			output = "Tom";
		}
		else if (n>20 && n<30 && n%2 != 0) {
			output = "Jerry";
		}
       return output;
	}

}
