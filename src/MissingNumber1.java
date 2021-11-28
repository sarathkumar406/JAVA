import java.util.*;
class MissingNumber1 
{
	public static void main(String[] args) 
	{
		//int[] ar = {1,4,2,2,5,5};
		int[] nums = {1,2,2,4};
		
		 Map<Integer, Integer> frequency = new HashMap<>();
            for (int num : nums) {
              frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            }
            System.out.println("frequency ----->> "+frequency);
			
			int[] ans = new int[2];
            for (int idx = 1; idx <= nums.length; idx++) {
              if (!frequency.containsKey(idx)) {
                ans[1] = idx;
              } //else if (frequency.get(idx) > 1) {
                //ans[0] = idx;
              //}
            }

		System.out.println(ans[0] +"    "+ans[1]);
	}
}
