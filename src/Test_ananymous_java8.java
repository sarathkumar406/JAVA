class Test_ananymous_java8 
{
	public static void main(String[] args) 
	{
		new Thread(()->{System.out.println("Hello World!");}).start();
		
	}
}
