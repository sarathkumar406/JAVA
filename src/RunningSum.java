class RunningSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4};
		int n = arr.length;
		int[] res = new int[n];
		int sum =0;
		for(int i =0;i<n;i++){
			sum+=arr[i];
			res[i] = sum;
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(res[i]+" ");
		}
		System.out.println();
		for(int i =1;i<n;i++){
			arr[i]+=arr[i-1];
		}

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
}
