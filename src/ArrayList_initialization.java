import java.util.*;
class ArrayList_initialization 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(al);

		ArrayList<Integer> al1 = new ArrayList<Integer>(){
			{
				add(2);
				add(2);
				add(2);
				add(2);
			}
		};
		System.out.println(al1);

		ArrayList<Integer> al_temp = new ArrayList<Integer>(Collections.nCopies(10,2));

	System.out.println(al_temp);
	}

	
}
