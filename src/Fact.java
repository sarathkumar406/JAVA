class Fact 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int res = factorial(n);
		System.out.println(res);
	}
	private static int factorial(int n){
			if(n!=0)
				return n*factorial(n-1);
			else
				return 1;
	}
}
