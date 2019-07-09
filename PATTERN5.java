import java.io.*;
import java.util.*;
class PATTERN5
{
	public static void main(String args[])
	{
		int i,j,k,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
		for(j=n-i;j>=1;j--)
		{
		System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.print("\n");
		}
		for(k=0;k<n+n+1;k++)
		{
			System.out.print("*");
		
		}
	}
}