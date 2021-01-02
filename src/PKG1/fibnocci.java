package PKG1;

public class fibnocci {

	public static void main(String[] args) 
	{
		int a= 0;
		int b = 1;
		int c=0;
		for(int i=1;i<=12;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;	
		}
	}

}
