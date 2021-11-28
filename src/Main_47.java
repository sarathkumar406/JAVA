class Pencil
{
	void write()
	{
		System.out.println("writes with lead");
	}
}

class Pen extends Pencil
{
	void write()
	{
		System.out.println("writes with ink");
	}
}

class Main_47 
{
	public static void main(String[] args) 
	{
		Pencil p = new Pencil();
		p.write();
		Pen p1 = new Pen();
		p1.write();
		Pencil p2 = new Pen();
		p2.write();
	}
}
