class Testing1 
{
	public static void main(String[] args) 
	{
		int[] prices =  {200,250,400,300};
		int discount = 20;
		//int res = finalResult(prices,discount);
		finalResult(prices,discount);
		double d = 10.6;
		d = Math.round(d);
		int n = (int)d;
		System.out.println(n);
	}
	static void finalResult(int[] prices, int discount){

		double dis = discount;
		dis = dis/100;
		int sum = 0;
		for(int i:prices)
		{
			double price = i;
			//System.out.println("price -before-->>"+price);
			double dis1 = price * dis;
			price = price - dis1;
			price = Math.round(price);
			sum+=price;
			//System.out.println("dis --->>"+dis);
			//System.out.println("price --->>"+price);
			
			//System.out.println();
			//break;
		}
		System.out.println("=======================1================");
			System.out.println("Sum total -------->>>> "+sum);
			System.out.println("=======================1================");
		

	}
}
