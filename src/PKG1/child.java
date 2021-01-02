package PKG1;

public class child extends Parent
{
	public child()
	{
		super(2);
		System.out.println("child default constructor");
	}
	public child(int a)
	{
		this();
		System.out.println("child 1 parameterised constructor");
	}
	public child(int a, int b)
	{
		this(1,2,2);
		System.out.println("child 2 parameterised constructor");
	}
	public child(int a, int b, int c)
	{
		this(2);
		System.out.println("child 3 parameterised constructor");
	}
	public child(int a, int b, int c, int d)
	{
		this(1,3);
		System.out.println("child 4 parameterised constructor");
	}
	
	public static void main(String[] args) 
	
	{
      child c1=new child(1,2,3,4);

	}

}
