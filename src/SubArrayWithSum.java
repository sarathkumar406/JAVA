public class SubArrayWithSum 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,7,6};
		int sum = 10;
		int n = arr.length;
		boolean res = false;
		for(int i = 0;i<arr.length;i++)//n times O(n) 
		{
			for(int j =i+1;j<n;j++)//n times
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println("i -->> "+arr[i]+" j--->> "+arr[j]);
					res = true;
				}
				//break;
			}
			if(res)
			{
				//break;
			}
		}
	}
}
