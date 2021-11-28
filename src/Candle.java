import java.util.*;
class Candle 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4,4,4,0,4,4,4,4));
		
		Collections.sort(al);
		if(al.get(0)==al.get(1))
		{
			System.out.println("value is : "+al.get(al.size()-1));
		}
		else
		{
			System.out.println("value is : "+al.get(0));
		}
		System.out.println(al);
	}
}
