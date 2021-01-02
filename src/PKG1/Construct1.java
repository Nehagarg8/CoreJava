package PKG1;

public class Construct1
{	
	public Construct1() 
	{		
		this(5.3,5.7,8,9);
		System.out.println("I am default constructor");
	}
	public Construct1(int a) 
	{
		this();
		System.out.println("I am one parameterised constructor");
	}
	public Construct1(String a,int b) 
	{
		this('1',"12", 8);
		System.out.println("I am 2 parameterised constructor");
	}
	public Construct1(char a,String b,int c) 
	{			
		this(10);
		System.out.println("I am 3 parameterised constructor");
	}
	public Construct1(double a,double b,int c,int d) 
	{
		System.out.println("I am 4 parameterised constructor");
	}

	public static void main(String[] args) 
	{
		Construct1 obj = new Construct1("neha",3);
	}

}
