package coding_Q_and_A;

public class Amstrong_number_from_1_to_1000 {

	public static void main(String[] args) {
		
		for(int n=1;n<=1000;n++)	
		{
			int a,i=0,j=0;
			a=n;
		while(a>0)
		{
			i=a%10;
			j=(i*i*i)+j;
			a=a/10;
		}
		if(n==j)
		{
			System.out.println(j);
		}
		}
	}

}
