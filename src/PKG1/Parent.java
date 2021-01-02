package PKG1;

public class Parent {
	
	public Parent()
	{
		this(34,78);
		System.out.println("parent default constructor");
	}
	
	public Parent(int a)
	{
		this(23,4.5,78);
		System.out.println("parent 1 parameterised constructor");
	}
	public Parent(int a, int b)
	{
		System.out.println("parent 2 parameterised constructor");
	}
	public Parent(int a, double b, int c)
	{
		this(1,1.2,3.2,3.5);
		System.out.println("parent 3 parameterised constructor");
	}
	public Parent(int a, double b, double c, double d)
	{
		this();
		System.out.println("parent 4 parameterised constructor");
	}
	

	public static void main(String[] args) 
	
	{
	Parent P1=new Parent(23);

	}

}
