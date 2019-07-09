import java.io.*;
import java.util.*;
class PATTERN8
{
	public static void main(String args[])
	{
		int i,j,n,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		k=n;
		for(i=0;i<n;i++)
		{
		for(j=0;j<=i;j++)
		{
		System.out.print(k);
		System.out.print("\t");
		k=k+1;
		}
		System.out.print("\n");
		}
		k=k-(2*n-1);
		for(i=0;i<n;i++)
		{	
		for(j=n-1;j>i;j--)
		{
		System.out.print(k);
		System.out.print("\t");
		k=k+1;
		}
			k=k-n;
		System.out.print("\n");
		}
	}
}