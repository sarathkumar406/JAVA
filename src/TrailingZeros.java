import java.util.Scanner;
public class TrailingZeros 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Value....");

		int n = sc.nextInt();
		int count =0;
		for(int i =5;(n/i)>0; i = i*5)
		{
			count+=(n/i);
		}
		if(count==0)
		{
			System.out.println("There is no Trailing Zeros in this number...! ");
		}
		else
		{
			System.out.println("count ---->> "+count);
		}

	}
}
