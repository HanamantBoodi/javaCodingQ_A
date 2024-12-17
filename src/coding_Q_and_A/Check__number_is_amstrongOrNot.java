package coding_Q_and_A;

import java.util.Scanner;

public class Check__number_is_amstrongOrNot {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
        int n= sc.nextInt();
        int a,i=0,j=0;
        a=n;
        while(a>0)
        {
        	i=a%10;
        	j=(i*i*i)+j;
        	a=a/10;
        }
		if (n==j)
		{
			System.out.println("Given Number is Amstrong:"+j);
		}else
		{
			System.out.println("Given Number is not Amstrong");
		}
	}

}
