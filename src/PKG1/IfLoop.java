package PKG1;

import java.util.Scanner;

public class IfLoop 
{

	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		if (a%2==0)
				
		{
			System.out.println("its an even number");
		}
		else 
		{
			System.out.println("its an odd number");
		}

	}

}
