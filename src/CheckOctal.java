class CheckOctal 
{
	public static void main(String[] args) 
	{
		
		int a = 016;
		int n = 0;

		while(a>0){
			int rem = a%8;
			n+=rem;
			a/=8;
		}
		System.out.println(a);
		System.out.println(n);

	}
}
