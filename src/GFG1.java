// A recursive solution for subset sum 
// problem 
class GFG1 { 

	// Returns true if there is a subset 
	// of set[] with sum equal to given sum 
	static boolean isSubsetSum(int set[], 
							int n, int sum) 
	{ 
		// Base Cases 
		if (sum == 0) 
			return true; 
		if (n == 0 && sum != 0) 
			return false; 

		// If last element is greater than 
		// sum, then ignore it 
		if (set[n - 1] > sum) 
			return isSubsetSum(set, n - 1, sum); 

		/* else, check if sum can be obtained 
		by any of the following 
			(a) including the last element 
			(b) excluding the last element */
		return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]); 
	} 

	/* Driver program to test above function */
	public static void main(String args[]) 
	{ 
		//int set[] = { 3, 34, 4, 12, 5, 2 }; 
		int set[] = { 2,4,6,10 }; 
		int sum = 16; 
		int count =0;
		int n = set.length; 
		if (isSubsetSum(set, n, sum) == true) {

			count++;
		}
		else{
			System.out.println("No subset with"
							+ " given sum"); 
		}
		System.out.println("Subsets count -->>"+count);
	} 
} 

/* This code is contributed by Rajat Mishra */
