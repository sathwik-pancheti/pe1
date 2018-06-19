package exercise1;
import java.util.Scanner;
public class StrRepeat {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter input1 (A String): ");
		String input1 = reader.nextLine();

		System.out.println("Enter input2 (A Number): ");
		int input2 = reader.nextInt();
		System.out.print("Output String is: " + display(input1,input2));
		
	}

		public static String display(String input1,int input2) {
			
		String output = "", substring="";
		output += input1;
		int length1=input1.length();
		for( int i=(length1-input2);i<length1;i++) {
			substring+=input1.charAt(i);}
		for(int i = 1; i<=input2;i++)
		{
			output = output + substring;
		}
		 return output ;
       
	}

}
