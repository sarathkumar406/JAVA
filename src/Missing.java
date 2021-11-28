class Missing 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,5};
		int n = arr.length;
		int m = n+1;
		int sum = (m*(m+1))/2;
		int res = 0;
		System.out.println(sum);
		for(int i=0;i<n;i++)
		{
			res+=arr[i];
		}
		int res_ab = sum-res;
		System.out.println(res_ab);
	}
}
