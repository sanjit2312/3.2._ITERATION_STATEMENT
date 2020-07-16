package iterationStatement;

import java.util.Scanner;

public class WhileLoop
{

	public static void main(String[] args) 
	{
		
		int n,m=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=obj.nextInt();
				
		while(m<=n)
		{
			System.out.print("Number is: "+m+" ");
			if(m%2==0)
				System.out.println("Even no is: "+m);
			else
				System.out.println("Odd number is: "+m);
			m++;

		}
		obj.close();

	}

}
