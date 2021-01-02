package PKG1;

public class Student 
{
	int age;
	int rollNo;
	
	public void Display1()
	{
		System.out.println("Display the age");
	}
	public void Display2()
	{
		System.out.println("Display the rollNo");
	}
	
	public static void main(String[] args) 
	{
		Student obj1=new Student();
		obj1.age=20;
		obj1.rollNo=2;
		System.out.println(obj1.age);
		System.out.println(obj1.rollNo);
		System.out.println("The age is:" +obj1.age);
		System.out.println("The roll no is:" +obj1.rollNo);
		obj1.Display1();
		obj1.Display2();
		
	}

}
