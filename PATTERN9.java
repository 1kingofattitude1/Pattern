import java.io.*;
import java.util.*;
class PATTERN9
{
	public static void main(String args[])
	{
		int i,j,n,m,k=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		for(j=n-i;j>0;j--)
		{
		System.out.print(" ");
		}
		for(j=0;j<(2*i)+1;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		}
		for(i=0;i<3;i++)
		{
		System.out.print(" ");
		for(j=0;j<3;j++)
		{
			System.out.print("*");
		}
		for(j=1;j<(2*n)-6;j++)
		{
			System.out.print(" ");
		}
		for(j=0;j<3;j++)
		{
			System.out.print("*");
		}
		
		System.out.print("\n");
		}
	}
}