package coding_Q_and_A;

import java.util.Scanner;

public class factorial_of_the_given_number {

	public static void main(String[] args) {
		//1.Find the Factorial of the given number
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int factorial=1;
		for (int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		System.out.println(factorial);
		{
			
		}
	
		

	}

}
