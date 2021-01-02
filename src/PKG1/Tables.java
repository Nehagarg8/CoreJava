package PKG1;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	
	{
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
	
	 for (int i=1;i<=12;i++)	
	 {
		 int c=a*i;
		 System.out.println(c);
	 }

	}

}
