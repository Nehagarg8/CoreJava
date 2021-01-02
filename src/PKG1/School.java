package PKG1;

public class School 
{

	public void Student() 
	{
		this.Student3(8,9,10);
		System.out.println("Parent default method");
	}
	public void Student1(int a) 
	{
		this.Student();
		System.out.println("Parent 1 parameterised method");
	}
	public void Student2(int a, int b) 
	{
		this.Student1(12);
		System.out.println("Parent 2 parameterised method");
	}
	public void Student3(int a, int b, int c) 
	{
		//this.Student();
		System.out.println("Parent 3 parameterised method");
	}
	public void Student4(int a, int b, int c, int d) 
	{
		this.Student2(12,14);
		System.out.println("Parent 4 parameterised method");
	}
	
	public static void main(String[] args) 
	
	{
		School s1=new School();
		//s1.Student4();

	}

}
