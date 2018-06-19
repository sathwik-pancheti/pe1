package exercise1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("Input a no :");
	    int n = num.nextInt();
	    int count = 0, ron = 0, r,x;
	    int temp = n;
	    while (n>0){
	    	r = n % 10;
	    	count = (count*10)+r ;
	    	n = n/10;
			 if (r%2 == 0){
				 ron += r; 
			 }
	    }
	    
	    if (temp == count && ron > 25 ){
	    	System.out.println( count + " is palindrome and the sum of even numbers"
	    			+ " is greater than 25");
	    }
	    else if (temp == count && ron < 25){
	    	System.out.println( count + " is palindrome and the sumof even "
	    			+ "numbers is less than 25");
	    }
	    else if (temp != count) {
	    	System.out.println(count + "is not a palindrome");
	    }
	}
}
