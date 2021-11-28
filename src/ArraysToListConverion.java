import java.util.*;
public class ArraysToListConverion
{
	public static void main(String[] args) 
	{
		String[] a = {"1","2","3","4"};
		List<String> al = Arrays.asList(a);
		al.set(1,"one");
		//al.add("two");
		//System.out.println(a.length);
		//System.out.println(al.size());

		for(int i =0;i<a.length;i++)
		{
			//System.out.println(a[1]);
			
			System.out.print(al.get(i)+" ");
		}
	}
}
