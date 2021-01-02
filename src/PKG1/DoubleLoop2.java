package PKG1;

public class DoubleLoop2
{

	public static void main(String[] args) 
	{
		int j =1;
		for (int i=0;i<4;i++)
		{
			for(int k=1;k<=i+1;k++)
			{
				System.out.print(j);
				System.out.print("\t");
				j++;			
			}
			System.out.println("");
		}
	}

}
