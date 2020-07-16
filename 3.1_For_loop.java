package iterationStatement;

import java.util.Scanner;

public class For_loop 
{

	public static void main(String[] args)
	{
		int n,fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=obj.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			fact*=i;
		}
		System.out.println("\nThe factorial of 1 to "+n+" natural number is: "+fact);
		obj.close();

	}

}
