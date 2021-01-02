package PKG1;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double b = 1;
		int c= a;
		if(a==0)
		     System.out.println("The factorial is 0");
				else {
					for(int i=1;i<=c;i++) 
					{
						b=b*a;
						a=a-1;
					}
					System.out.println("The factorial is "  +b);	
				    }					
	}
}
