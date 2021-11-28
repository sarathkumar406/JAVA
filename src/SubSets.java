class SubSets 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,4,6,10};
		int n = arr.length;
		int sum =0;
		int total = 16;
		int count = 0;
		for(int i =0;i<n;i++)
		{
			sum+=arr[i];
			System.out.println(sum);
			if(sum==total){
				count++;
			}

		}
		System.out.println("SubSets ---> "+count);
	}
}
