class SelectionSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {8,4,2,3,1};
		selection(arr);
		insertion(arr);
	}

	public static void selection(int[] arr){
		int min;
		for(int i =0;i<arr.length-1;i++)
		{
			min = i;
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[j] < arr[min]){
					min = j;
				}
			}
			int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}


	public static void insertion(int[] arr){

		int temp,j;//8,4,2,3,1

		for(int i =1;i<arr.length-1;i++){
			
			temp = arr[i]; //4
			j=i;//1
			while(arr[j-1] > temp && j>=1){//8 > 4
				arr[j] = arr[j-1];//4=8
				j--;
			}
			arr[j]= temp;
		}
		
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}

	}
}
