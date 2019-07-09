import java.io.*;
import java.util.*;
class PATTERN4
{
	public static void main(String Args[])
	{
		int i,j,k=1,n;
		int a=65;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print((char)a);
				a=a+i;
			}
			System.out.print("\n");
		}
	}
}
		