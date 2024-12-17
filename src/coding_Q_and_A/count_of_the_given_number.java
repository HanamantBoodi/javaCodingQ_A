package coding_Q_and_A;

import java.util.Scanner;

public class count_of_the_given_number {

	public static void main(String[] args) {
		int a,i=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		a=n;
		while(a>0) 
		{
			a=a/10;
			i++;
			
		}
		System.out.println("Total number of digits: "+i);

	}

}
