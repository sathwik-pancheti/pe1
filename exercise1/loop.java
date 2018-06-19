package exercise1;

import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("input:");
		int n = num.nextInt();
		System.out.print(display(n));
	}


	public static String display(int n) {

		String output="";
		for (int i=1; i <= n; i++)	{
			for (int j=1; j<=i ; j++ ) {
				output += i + " ";
			}
		}
		return output;
	}	
}
