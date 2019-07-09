import java.io.*;
import java.util.*;
class PATTERN7
{
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		for(j=i;j<n;j++)
		{
			System.out.print("*");
		}
		for(j=0;j<=(2*i);j++)
		{
			System.out.print(" ");
		}
		for(j=i;j<n;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		}
		for(i=0;i<n;i++)
		{
		for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		for(j=(2*n-2);j>=(2*i);j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		}
		
	}
}