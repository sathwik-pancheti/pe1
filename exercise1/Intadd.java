package exercise1;
import java.util.Scanner;
public class Intadd {

	public static void main(String[] args) {
		Scanner no =new Scanner(System.in);
		System.out.println("Input no. of elements:");
		int count=no.nextInt();
		int []number=new int[count];
		System.out.println("Input numbers:");
		for(int i=0;i<count;i++)
		{
			number[i]=no.nextInt();
		}
		System.out.println("Sum is: " + display(number));
	}
		
		public static int display(int number[])
		{
			int sum=0;
			for(int i=0;i<number.length;i++)
			{
				sum=sum+number[i];
			}
			return sum;
		}

	}


