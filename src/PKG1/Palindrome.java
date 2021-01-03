package PKG1;

import java.util.Scanner;

public class Palindrome 
 
{ 
    
	public static void main(String[] args)
	
	{
		 System.out.println("Enter the number");
	     Scanner s = new Scanner(System.in);
		 int a = s.nextInt();
		 int number =a;
		 int b =0;
		 
		 while(a>0)
		 {
		   int remainder = a%10;
		    b = (b*10)+remainder;
		  System.out.println("The digit is" +b);
		   a=a/10;
		 }
		 
		if (b==number)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
	}

}
