package PKG1;

public class calculation 
{
	
public int Mul(int a, int b)
{
    int c;	
	c = a*b;
	System.out.println("value of mul:" +c);
	return c;
}

public int Sum(int a, int b)
{
	int c = a+b;
	System.out.println("value of sum:" +c);
	return c;
}

public int Sub(int a, int b)
{
	int c = a-b;
	System.out.println("Value of sub:" +c);
	return c;
}
public void Divide(int a, int b)
{
	int c = a/b;
	System.out.println("Value of expression is:" +c);
	
}

public static void main(String[] args) 
{
calculation obj1 = new calculation();
int m=obj1.Mul(10,2);
int n=obj1.Sum(m,2); 
int o =obj1.Sub(n,2);
int p =obj1.Sum(o, 2);
obj1.Divide(p,2);
//System.out.println("The value of expression is:" +k);
}

}
