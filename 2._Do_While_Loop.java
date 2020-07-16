package iterationStatement;

import java.util.Scanner;

public class Do_While_Loop
{

	public static void main(String[] args)
	{
		
		int n,m=1,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=obj.nextInt();
		
		do 
		{
			System.out.print(m+" ");
			sum+=m;
			m++;
		}
		while(m<=n);
		System.out.println("\nThe sum of 1 to "+n+" natural number is: "+sum);
		
		obj.close();
		
	}

}
