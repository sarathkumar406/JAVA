import java.util.*;
class ClosestZero 
{
	public static void main(String[] args) 
	{
		//int[] arr = {2,1,-1,3,5};
		int[] arr = {4,7,9,2,-2};
		int n = arr.length;
		int res = findClosestZero(arr,n);
		System.out.println("Closest to Zero is : "+res);
	}

	static int findClosestZero(int[] arr, int n){
		int currentValue =0;
		
		Arrays.sort(arr);
		int closestValue = arr[0];
		for(int i =0;i<n;i++)
		{
			currentValue = arr[i]*arr[i];
			System.out.println("currentValue ---->> "+currentValue);
			System.out.println("closestValue ---->> "+closestValue);
			if(currentValue <= (closestValue * closestValue))
			{
				closestValue = arr[i];
			}
			System.out.println("========================"+closestValue);
			System.out.println();
		}
		return closestValue;
	}
}
