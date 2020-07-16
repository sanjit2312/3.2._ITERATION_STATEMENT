package iterationStatement;

import java.util.Scanner;

public class Nested_For_Loop
{

	public static void main(String[] args)
	{
		int n;
		System.out.println("Enter a number: ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("*");
			}
			System.out.println();

		}
		obj.close();
		
	}

}
