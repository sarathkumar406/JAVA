import java.util.*;
class Sample_check123 
{
	public static void main(String[] args) 
	{

		ArrayList<Integer> al = new ArrayList<>();
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		long sum =0;
		for(int i =0;i<al.size();i++){
			sum+=al.get(i);
		}

		System.out.println("sum -------------->>> "+sum);
	}
}
