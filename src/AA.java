import java.math.RoundingMode;
import java.text.DecimalFormat;
class AA 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		String s2 = new String("Hellow");
		System.out.println(s1 = s2);
		int[] x = new int[3];
		System.out.println(x[0]);
		String octal ="016";
		 //Integer i = Integer.parseInt(octal,8);
		 //System.out.println("i value : "+i);

		 int[] a = {0,2,4,1,3};
		 for(int i =0; i<a.length;i++)
		{
			 a[i] = a[(a[i]+3)%a.length];
			 System.out.println(a[i]);
		}

		int d1 = 2;
		int d2 = 5;

		int d3 = 2/5;

		System.out.println(d3);
		System.out.format("%.4f", 4.0);

		DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.CEILING);
		 System.out.println(df.format(d1)/df.format(d2));
	}
}