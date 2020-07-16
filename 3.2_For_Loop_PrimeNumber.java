package iterationStatement;

import java.util.Scanner;

public class For_Loop_PrimeNumber
{

	public static void main(String[] args)
	{
		
        int number;
        boolean prime=false;
        
        System.out.println("Enter a number to check prime number: ");
        Scanner obj=new Scanner(System.in);
        number=obj.nextInt();
        
        if(number==0 || number==1)
        {
        	System.out.println("Given number "+number+" is not prime number");
        }
        else
        {
        	for(int i=2;i<number/2;i++)
        	{
        		if(number % i==0)
        		{
        			prime=true;
        			break;
        		}
        	}
        }

        if(prime==false)
        {
        	System.out.println("Given number "+number+" is prime number:");
        }
        else
        {
        	System.out.println("Given number "+number+" is not prime number:");
        }
        obj.close();
	}

}
