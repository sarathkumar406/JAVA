import java.util.*;
class math
{
	public static void main(String[] args) 
	{
		int a = 234;
		int product = 1;
		int sum = 0;
		
		while(a>0)
		{
			int d = a%10;
			 a = a/10;
			product*=d;
			sum+=d;
		}

		int res = product - sum;

		System.out.println(res);
		System.out.println(product);
		System.out.println(sum);
		
	}
}
