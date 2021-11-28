class BubbleSort1 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,3,1,5,9};
		bubbleSort(arr);
		

	}

	public static void bubbleSort(int[] arr){

		int pass,i,temp;
		boolean swapped =true;
		int[] res = new int[arr.length];
		int count =0;

		for(pass=arr.length-1;pass>=0 && swapped;pass--)
		{
			swapped = false;
			for(i=0;i<= pass-1;i++)
			{
				if(arr[i] > arr[i+1])
				{
					temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}
				
			}
		}

		for(int j =0;j<arr.length;j++)
		{
			System.out.println(arr[j]+" ");
		}

		
	}
}
