import java.util.Scanner;
public class Febanocii 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Values : ");
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		int res = fib(n,arr);
		int res1 = fib_bottom_approach(n);
		System.out.println("res : "+res);
		System.out.println("res : "+res1);
	}
	public static int fib(int n,int[] arr){
		int res = 0;
		if(arr[n] != 0)
			return arr[n];
		if(n==1 || n==2)
			res = 1;
		else
			res = fib(n-1,arr)+fib(n-2,arr);
		
		arr[n] = res;
		return res;

	}

	public static int fib_bottom_approach(int n){
		
		if(n==1 || n==2)
			return 1;
		int[] fib_bottom_approach = new int[n+1];
		fib_bottom_approach[1] = 1;
		fib_bottom_approach[2] = 1;
		for(int i = 3; i<=n;i++){
			fib_bottom_approach[i] = fib_bottom_approach[i-1]+fib_bottom_approach[i-2];
		//System.out.println("fib_bottom_approach[i] .."+fib_bottom_approach[i]);
		//System.out.println("i .."+i);
		}
		
		//System.out.println(fib_bottom_approach.length);
		return fib_bottom_approach[n];
	}
}

