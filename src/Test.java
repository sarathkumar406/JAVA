import java.io.PrintWriter;
class Test 
{
	public static void main(String[] args) 
	{
		PrintWriter pw = new PrintWriter("abc.txt");
		System.out.println(10/0);
		System.out.println("Hello World!");
	}
}
