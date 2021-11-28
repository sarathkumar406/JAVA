public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4};
		int n = arr.length;
		for(int i =0;i<n;i++)//o(n)
		{
			if(arr[i]!=arr[i+1]-1)
			{
				System.out.println(arr[i]+1);
				//break;
			}
		}
	}
}
