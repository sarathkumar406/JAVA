class SubSetsWithSum 
{
	public static void main(String[] args) 
	{
		//int[] arr = {2,3,7,1,4,5};
		int[] arr = {2,3,4,6,10};

		int sum = 16;

		System.out.println(countOfSubSystems(arr,sum));
	}

	private static int countOfSubSystems(int[] arr, int sum){
		
		if(arr.length ==0 || sum<=0){
			return 0;
		}

		int n = arr.length;

		int[][] count = new int[n][sum+1];

		for(int i =0;i<n;i++){
			count[i][0]=1;
		}

		for(int j=0;j<=sum;j++){
			if(arr[0]==j)
			{
				count[0][j]=1;
			}
		}

		for(int i=1;i<n;i++){
			for(int j =1;j<=sum;j++){
				int includeValue = 0;
				int excludeValue = 0;

				if(arr[i]<=j){
					includeValue = count[i-1][j-arr[i]];
				}
			excludeValue = count[i-1][j];

			count[i][j]= includeValue + excludeValue;
			}
		}
	return count[n-1][sum];

		
	}
}
