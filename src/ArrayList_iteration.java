import java.util.*;
class ArrayList_iteration 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(4);
		al.add(3);
		al.add(2);
		System.out.println(al);

		//for loop
		System.out.println("Normal for loop");
		for(int i =0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}

		//for each
		System.out.println("Advances for loop");
		for(Integer i : al)
		{
			System.out.println(i);
		}
		System.out.println("while loop");
		//while loop
		int count =0;
		while (al.size()>count)
		{
			System.out.println(al.get(count));
			count++;
		}

		System.out.println("Iteration");
		//Iterator

		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("Using enumaration");


		Enumeration<Integer> e = Collections.enumeration(al);

		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

		//sorting
		
		System.out.println("ascending order");
		Collections.sort(al);
		System.out.println(al);

		//descending order

		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Descending order");
		System.out.println(al);

//linked list to array list

		LinkedList<Integer> ll =  new LinkedList<>();

		ll.add(1);
		ll.add(2);
		ll.add(5);
		ll.add(3);

		System.out.println("Linked list : "+ll);

		List<Integer> aal = new ArrayList<>(ll);
		System.out.println("Linked to array list convertion : "+aal);

//vector to arraylist

		Vector<Integer> v = new Vector<>();
		v.add(20);
		v.add(10);
		v.add(40);
		v.add(30);

		System.out.println(v);

		List<Integer> vtoa = new ArrayList<>(v);

		System.out.println(vtoa);


		System.out.println("ArrayList to Integer array");

		Integer[] i1 = al.toArray(new Integer[al.size()]);

		for(Integer i : i1)
		{
			System.out.print(i+" ");
		}

		System.out.println();

		System.out.println("Array to arrayList COnvertion");

		Integer[] a = {2,3,4,5};

		ArrayList<Integer> ala = new ArrayList<>(Arrays.asList(a));

		System.out.println(ala);

		ArrayList<Integer> arraylist = new ArrayList<>();

		Collections.addAll(arraylist,a);

		System.out.println(arraylist);


		LinkedList<Integer> arraytolinked = new LinkedList<Integer>(al);
		
		System.out.println("Arraylist to linkedlist");
		System.out.println(arraytolinked);


		Iterator itr1 = arraytolinked.descendingIterator();
		Iterator itr2 = arraytolinked.iterator();
System.out.println("LInked lis reverse order");
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}

System.out.println("linkedlist normal order");
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println();
		System.out.println("vector to list");

		List<Integer> vv = Collections.list(v.elements());

		System.out.println("vv ------->>>> "+vv);


	}
}
