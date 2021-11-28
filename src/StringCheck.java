import java.util.*;
class  StringCheck
{
	public static void main(String[] args) 
	{
		String str = "gif";
		String str1 = "";
		if(str.indexOf(".")>-1)
		{
		 str1 = str.substring(0,str.lastIndexOf("."));
		}
		String str_temp = str.substring(str.lastIndexOf(".")+1);
		System.out.println(str1);
		System.out.println(str_temp);
		/*String[] arrOfStr = str.split("\\.");
		System.out.println("length ----> "+arrOfStr.length);
		
		 String str_ = arrOfStr[1];
            String str_temp = arrOfStr[0];

			if(str_temp.isEmpty())
		{
				System.out.println("this is empty");
		}
			System.out.println(arrOfStr[0]);
			System.out.println(arrOfStr[1]);
			*/
		

		/*Hashtable<String,String> ht = new Hashtable<>();
		ht.put("png","sample");
		ht.put("gif","simplegif");
		ht.put("html","index");

		System.out.println(ht);*/

		

		
	}
}
