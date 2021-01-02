package PKG1;

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args) 
	{
	    System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		if((a==0)||(a==1))
		{
			System.out.println("The number is not prime");
		}
		if(a==2)
		{
			System.out.println("The number is even prime");
		}
		for(int i=2;i<=a/2;i++)
		{
			if (a%i==0)
			{
				System.out.println("The number is not prime");			
				break;
			}
			else if (i==a/2)
			{
				System.out.println("The number is prime");
			}
		}
	}
}
