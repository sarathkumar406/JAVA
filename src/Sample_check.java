class Sample_check 
{
	public static void main(String[] args) 
	{
		int p = 5, q = 2;
		int res = (int)Math.pow(p,q);
		System.out.println("res --->> "+res);
		while(res>0)
		{
			int rem = res%10;
			System.out.println("rs --->>	"+rem);
			if(res%rem==0)
			{
				System.out.println(rem);
				break;
			}
			res= res/10;
		}
	}
}
