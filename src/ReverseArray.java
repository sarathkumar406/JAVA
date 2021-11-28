class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] ar = {4,3,2,5};

		int[] res = reverseArray(ar);

		for(int i =0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}

	public static int[] reverseArray(int[] a){

		int n = a.length;
		//int count = 0;
		
		int[] arr = new int[n];

		/*for(int i = n-1;i>=0;i--)
		{
			arr[count] = a[i];
			count++;
		}*/
		for(int i = 0; i < n; i++)
		{
			arr[i] = a[n-1-i];
		}
		return arr;

	}
}
