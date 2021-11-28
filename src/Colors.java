import java.util.*;
class Colors 
{
	public static void main(String[] args) 
	{
		int n = 9;
		int sum = 0;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		for(int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		Arrays.sort(ar);
		System.out.println();
		HashMap<Integer,Integer> hm = new HashMap<>();
		HashMap<Integer,Integer> hm1 = new HashMap<>();
		int c = 0;
		for(int i =0;i<ar.length;i++)
		{
			sum = 0;
			if(hm.containsKey(ar[i])){
				hm.put(ar[i],hm.get(ar[i])+1);
				int val1 = (int)hm.get(ar[i]);
				sum+=((val1)/2);
				c=sum;
				hm1.put(ar[i],sum);
			}
			else
			{
				hm.put(ar[i],1);
			}
		}
		System.out.println(hm);
		System.out.println(hm1);
		System.out.println(c);
		
		int count = 0;
		for(Map.Entry m : hm.entrySet() )
		{
			int val = (int)m.getValue();
			count+=((val)/2);
			//System.out.println(val);
		}
		System.out.println("count ------>>> "+count);
	}
}
