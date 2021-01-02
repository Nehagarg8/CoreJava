package PKG1;

import java.util.Scanner;

public class primeNew

{

	public int GetPrime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if (a%i==0)
			{
				//message = true;
				System.out.println("The number is not prime");			
				break;
			}
			else if (a%i!=0)
			{
				System.out.println("The number is prime");
			    break;	
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{

		  System.out.println("Enter the number");
			Scanner s = new Scanner(System.in);
			int a= s.nextInt();
			primeNew p = new primeNew();
			p.GetPrime(a);
			//boolean message = false;
			/*for(int i=2;i<=a;i++)
			{
				if (a%i==0)
				{
					//message = true;
					System.out.println("The number is not prime");			
					break;
				}
				else if (a%i!=0)
					

					System.out.println("The number is prime");
				break;
					
					
			}
				 /*if (!message)
				
					System.out.println("The number is prime");
				 else
					 
					 System.out.println("The number is not prime");*/

	}

}
