package PKG1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number a");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		System.out.println("Enter the number b");
		Scanner s1 = new Scanner(System.in);
		int b = s1.nextInt();
		if (a==b)
		{
			System.out.println("Numbers cannot be swapped");
		}			
		else 		
		{
			int c=b;
			b=a;	
			System.out.println("Values of b is:" +a);
			a=c;
			System.out.println("Value of a:" +c);
		}
		

	}

}
