class Tendor extends Singer 
{
	public String sing()
	{
		return "fa";
	}
	public static void main(String[] args) 
	{
		Tendor t = new Tendor();
		Singer s = new Tendor();
		System.out.println(s.sing()+"----------"+t.sing());
	}
}
class Singer
{
	public String sing()
	{
		return "la";
	}
}
