class BubbleSort
{
	public static void main(String[] args) 
	{
		int[] arr = {4,3,1,2};

		int n = arr.length;
		int count = 0;
		for(int j=0;j<n-1;j++)
		{
			for(int i = 0;i<n-j-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					count++;
				}
			}
		}

		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println(count);

	}
}
