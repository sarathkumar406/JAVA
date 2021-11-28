import java.util.ArrayList;
import java.util.Collections;
class ArrayList_Test 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();

		al.add("sarat");
		al.add("kumar");
		al.add("sajja");
		al.add("amma");
		al.add("nanna");
		System.out.println(al);
		
		//add element at perticular index
		al.add(1,"sai");
		
		System.out.println(al+" -- "+al.size());

		//update element

		al.set(0,"prakash");
		
		System.out.println(al+" -- "+al.size());
		
		//remove element
		al.remove("k");
		al.remove("prakash");
		
		System.out.println(al+" -- "+al.size());
		al.remove(1);

		System.out.println(al+" -- "+al.size());
		
		//Iterating the arraylist
		for(String s : al)
		{
			System.out.print(s+" ");
		}

		int index = al.indexOf("Sajja");

		Collections.sort(al);
		
		System.out.println(al+" -after sorting- "+al.size());
		System.out.println("index of sajja is : "+index);
		al.clear();
		System.out.println(al);

	}
}
