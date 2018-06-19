package exercise1;

import java.util.Scanner;
public class Type {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.println("Input:");
		char n = type.next().charAt(0);
		System.out.print(display(n));
	}
		public static String display(char n) {
			
			String output = "";
		if(Character.isUpperCase(n) ) {
			output = "Capital letter";
		}
		else if(Character.isLowerCase(n)) {
			output = "small letter";
		}
		else if(Character.isDigit(n)) {
			output ="digit";
		}
		else if(!(n == ' '))
		{
			output = "specialsymbol";
		}
		return output;
		
	}

}
