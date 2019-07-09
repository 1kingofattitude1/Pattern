import java.io.*;
import java.util.*;
class PATTERN2
{
	public static void main(String Args[])
	{
		int i,j,k,x,n;
		int a=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n = sc.nextInt();
		for(x=n;x>=1;x--)
		{
			a=0;
		for(i=0;i<n;i++)
		{
			a=a+1;
			System.out.print(a);
		}
		
		for(j=n;j>=1;j--)
		{
			
			System.out.print(a);
			a=a-1;					
		}
		n=n-1;
			System.out.print("\n");
		
		}
	}
}