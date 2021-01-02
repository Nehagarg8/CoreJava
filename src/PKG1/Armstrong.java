package PKG1;

import java.util.Scanner;

public class Armstrong 
{ 
	//int r,c =0;
	//int z=0;

	public static void main(String[] args) 
	{
	System.out.println("Enter the number");
     Scanner s = new Scanner(System.in);
	 int a = s.nextInt();
	 int z = 0;
	 int g = a;
	 int i =0;
	 //for(int i=0;i<3;i++)
	 while(i<=a)
	 {
	 int r = a%10;
	 int c = r*r*r;
	 z = z+c;
	 a= a/10;	 
	
	 System.out.println(+a);
	 i++;
	 }
	 if (z==g)
	 {
		 System.out.println("The number is armstrong");
	 }
	 else
	 {
		 System.out.println("The number is not armstrong");
	 }
	}

}
