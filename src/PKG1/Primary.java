package PKG1;

public class Primary extends School
{
	public void Holy() 
	{
		super.Student4(11,12,13,14);
		System.out.println("Child default method");
	}
	public void Holy1(int a) 
	{
		this.Holy3(9,10,11);
		System.out.println("Child 1 parameterised method");
	}
	public void Holy2(int a, int b) 
	{
		this.Holy1(6);
		System.out.println("Child 2 parameterised method");
	}
	public void Holy3(int a, int b, int c) 
	{
		this.Holy();
		System.out.println("Child 3 parameterised method");
	}
	public void Holy4(int a, int b, int c, int d) 
	{
		this.Holy2(7,8);
		System.out.println("Child 4 parameterised method");
	}
	public static void main(String[] args)
	{

       Primary p1=new Primary();
       p1.Holy4(1,2,3,4);

	}

}
