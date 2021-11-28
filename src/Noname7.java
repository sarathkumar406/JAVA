class ClosestZero 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,1,-1,3,5};
		int n = arr.length;
		int res = findClosestZero(arr,n);
		System.out.println("Closest to Zero is : "+res);
	}

	static int findClosestZero(int[] arr, int n){
		int currentValue =0;
		int closestValue = arr[0];
		Arrays.sort(arr);
		for(int i =0;i<n;i++)
		{
			currentValue = arr[i]*arr[i];
			if(currentValue <= (closestValue * closestValue))
			{
				closestValue = arr[i];
			}
		}
		return closestValue;
	}
}
