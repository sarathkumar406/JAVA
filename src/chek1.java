import java.lang.*;
import java.text.*;
class chek1 
{
	public static void main(String[] args) 
	{
		double d = 2.2;

		int a = (int)d;
		System.out.println(a);

		double answer = 5212.1;
		DecimalFormat df = new DecimalFormat("###.####");
		//DecimalFormat formatter = new DecimalFormat("#0.00");
		System.out.println(df.format(answer));
		//System.out.println(formatter.format(answer));
	}
}
