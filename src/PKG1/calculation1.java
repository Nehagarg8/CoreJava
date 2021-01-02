package PKG1;

public class calculation1
{
	public int Subtract(int a, int b)
	{
	    int c;	
		c = a-b;
		System.out.println("value of Sub:" +c);
		return c;
	}

	public int Mul(int a, int b)
	{
		int c = a*b;
		System.out.println("value of Mul:" +c);
		return c;
	}

	public void Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Value of expression is:" +c);
	}
	
	public static void main(String[] args) 
	{
	calculation1 obj1 = new calculation1();
	int m=obj1.Subtract(10,2);
	int n=obj1.Mul(m,2);
	int k =obj1.Subtract(n,2);
	obj1.Sum(k,2);
	//System.out.println("The value of expression is:" +k);
	}
}

