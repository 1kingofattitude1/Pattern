import java.io.*;
import java.util.*;
class PATTERN6
{
	public static void main(String args[])
	{
		int i,j,n,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		m=2*n;
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
			System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<i;j++)
			{
			System.out.print(" ");
			}
			for(j=i;j<m;j++)
			{
			System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}