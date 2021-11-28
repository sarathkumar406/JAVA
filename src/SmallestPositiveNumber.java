class SmallestPositiveNumber
{
	public static void main(String[] args) 
	{
		int[] ar = {1,2,0};
		int n = ar.length;

		for(int i =0;i<n;i++){
			while(ar[i]>=1 && ar[i] <=n && ar[i]!=ar[ar[i]-1])
			{
				int temp = ar[i];
				ar[i] = ar[ar[i]-1];
				ar[ar[i]-1] = temp;
			}
		}

		for(int i =0;i<n;i++)
		{
			if(ar[i]!= i+1)
				System.out.println(i+1); 
		}

		System.out.println(n+1); 
	}
}
