import java.io.*;
import java.util.*;
class PATTERN3
{
	public static void main(String Args[])
	{
	int i,j,k,n;
	int a=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Length");
	n=sc.nextInt();
	for(i=0;i<n;i++)
	{	
	for(j=n-i;j>1;j--)
	{
		System.out.print(" ");
	}
	for(j=0;j<=i;j++)
	{
		System.out.print(a);
		System.out.print(" ");
	}
	System.out.println();
	a=a+1;
	}
	
	}	
}