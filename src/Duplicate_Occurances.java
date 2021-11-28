import java.util.*;
class Duplicate_Occurances 
{
	static void findDuplicateWords(String str){
		String[] str_array = str.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		//int count=0;
		for(int i =0;i<str_array.length;i++)
		{
			if(hm.containsKey(str_array[i]))
			{
				int val = hm.get(str_array[i]);
				hm.put(str_array[i],val+1);
			}
			else
			{
				hm.put(str_array[i],1);
			}
			
			//System.out.println("str_array ---->>"+str_array[i]);
			
		}
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			String tempString = itr.next();
			if(hm.get(tempString)>1)
			{
				System.out.println("Duplicate values -->> "+tempString);
			}
		}
		//System.out.println("hm ---->>"+hm);

	}
	public static void main(String[] args) 
	{
		findDuplicateWords("I am am learning java java");
		findDuplicateCharacters("javaj2ee");

	}

	static void findDuplicateCharacters(String str){

		char[] str_array = str.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		//int count=0;
		for(int i =0;i<str_array.length;i++)
		{
			if(hm.containsKey(str_array[i]))
			{
				int val = hm.get(str_array[i]);
				hm.put(str_array[i],val+1);
			}
			else
			{
				hm.put(str_array[i],1);
			}
			
			//System.out.println("str_array ---->>"+str_array[i]);
			
		}
		Iterator<Character> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			char tempString = itr.next();
			if(hm.get(tempString)>1)
			{
				System.out.println("Duplicate values -->> "+tempString);
			}
		}
		//System.out.println("hm ---->>"+hm);


	}
}
