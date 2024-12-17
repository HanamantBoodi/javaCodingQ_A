package coding_Q_and_A;

import java.util.Scanner;

public class swap_of_two_number_using_third_variable {

	public static void main(String[] args) {
		
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value a");
		a=sc.nextInt();
		System.out.println("Enter the value b");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("Swapped Number Value of a: ");
        System.out.println(a);
        System.out.println("Swapped Number Value of b: ");
        System.out.println(b);
	}

}
