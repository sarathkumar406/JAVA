interface One
{
	default void method(){
		System.out.println("One");
	}
}
interface Two
{
	default void method(){
		System.out.println("Two");
	}
}
class Three implements One,Two
{
	public void method(){
		One.super.method();
	}
	
}
