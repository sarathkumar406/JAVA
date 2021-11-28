import java.util.*;
class Candies 
{
	public static void main(String[] args) 
	{
		//int[] candies  = {2,3,5,1,3};
		int[] candies  = {12,1,12};
		int extraCandies = 10;
		int n = candies.length;
		List<Boolean> res = new ArrayList<>();
		int max =0;
		for(int i =0;i<n;i++){
			if(max <= candies[i]){
				max = candies[i];
			}
		}
		System.out.println("max  "+max);
		for(int i =0;i<n;i++){
			
			if(candies[i] >= max){
				res.add(true);
			}
			else
			{
				candies[i]+= extraCandies;
				System.out.println("--"+candies[i]);
				if(candies[i] >= max){
					res.add(true);
				}
				else
				{
					res.add(false);
				}
			}
		}

		System.out.println("res ----->>> "+res);
	}
}
