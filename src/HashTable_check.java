import java.util.*;
class HashTable_check 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht = new Hashtable<>();

		ht.put(10,"sarat");
		ht.put(1,"kumar");
		ht.put(4,"sajja");
		ht.put(11,"sai");

		Set st = ht.entrySet();

		Iterator itr = st.iterator();

		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			System.out.println(m.getKey()+"    "+m.getValue());
		}
		
	}
}
