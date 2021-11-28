public class A
{
	public static void main(String[] args) 
	{
		byte b;
		int i = 258;
		double d = 325.59;

		b = (byte)i;
		System.out.println(b);

		
		i = (int)d;
		System.out.println(i);

		
		b = (byte)d;
		System.out.println(b);
		 StringBuffer s1 = new StringBuffer("Complete");  
        s1.setCharAt(1,'i');  
        s1.setCharAt(7,'d');  
        System.out.println(s1);

		 int count = 1;  
    while (count <= 15) {  
    System.out.println(count % 2 == 1 ? "***" : "+++++");  
    ++count;  
	}
	}
}
//11 + 5-5+10+3