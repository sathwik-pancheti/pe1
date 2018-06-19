package exercise1;

import java.util.Scanner;
public class vowelconsonant {
	public static void main(String[] args) {
		Scanner word = new Scanner(System.in);
		System.out.println("Input:");
		String str = word.nextLine();
		System.out.print(display(str));
		

	}
		public static String display(String str) {
			
			String output = "";
		for (int i=0; i < str.length(); i++)
		{
			if(!Character.isLetter(str.charAt(i)))
			{
				output += "Input is not a letter.";
				continue;
			}
			switch(str.charAt(i))
			{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': output += "Vowel ";
			break;
			default: output += "Consonant ";
			}

		}
		return output;
	}

}
