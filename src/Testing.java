class BaseTest{
	void print(){
		System.out.println("Base test called");
	}
}

public class Testing extends BaseTest
{
	void print(){
		System.out.println("Testing Class Called");
	}
	public static void main(String[] args) 
	{
		//BaseTest b = new Testing();
		Testing b = new BaseTest();
		b.print();
	}
}
