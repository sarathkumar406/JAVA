class ShuffleArray 
{
	public static void main(String[] args) 
	{
		//int[] nums = {2,5,1,3,4,7}; 
		int[] nums = {1,1,2,2}; 
		//int n = 3;
		int n = 2;
		int size = nums.length;
		int[] res = new int[size];
		/*int count = n;
		int index = 0;
		for(int i =0;i<n;i++){
			System.out.println("index--->"+index);
			res[index] = nums[i];
			res[index+1] = nums[count];
			index+=2;
			count++;
		}*/
		
		for(int i =0;i<n;i++){
			res[2*i] = nums[i];
			res[2*i+1] = nums[n+i];
		}
		for(int i =0;i<res.length;i++){
			System.out.print(res[i]+" ");
		}
	}
}
