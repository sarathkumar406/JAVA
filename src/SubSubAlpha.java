class SubSubAlpha extends Alpha 
{
	private SubSubAlpha()
	{
		s+="subsub";
	}
	public static void main(String[] args) 
	{
		new SubSubAlpha();
		System.out.println(s);
	}
}
class subAlpha extends Alpha
{
	private subAlpha()
	{
		s+= "sub";
	}
}
class Alpha
{
	static String s = " ";
	protected Alpha()
	{
		s+= "alpha ";
	}
}
