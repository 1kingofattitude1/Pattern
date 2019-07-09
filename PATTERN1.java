import java.io.*;
import java.util.*;
class PATTERN1
{
	public static void main(String args[])
	{
		int i,j,k,n;
		int a=97;
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;)
			{
				System.out.print((char)(a));
				j=j+2;
				for(k=0;k<i;)
				{
					k=k+2;
					System.out.print(b);
					b=b+1;
				}
            }
			System.out.print("\n");
		}
	}
}