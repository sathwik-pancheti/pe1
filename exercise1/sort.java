package exercise1;
import java.util.Scanner;
public class sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter no:");
		int number = input.nextInt(),count=0,k;	
		
		System.out.println(getLargestNumber(number));
        while(number>0)
        {
            k=number%10;
            if(k%2==0)
                count+=k;
            number/=10;
        }
        if(count>15)
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static long getLargestNumber(int input) {
        int[] numbers = new int[10];
        for(int i = input; i != 0; i /= 10) {
            numbers[i % 10]++;
        }
        int counter = 0;
        long result = 0;
        for (int i = 0; i < 10; counter += numbers[i++]) {
            result += (int)((Math.pow(10, numbers[i]) * i - 1) / 9)
                    * Math.pow(10, counter);
        }
        return result;
    }
    
}


