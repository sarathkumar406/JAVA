// filename Main.java
class Point { 
	protected int x, y; 

	public Point() 
	{ 
	} 
} 

public class Main1 { 
	public static void main(String args[]) 
	{ 
		Point p = new Point(); 
		System.out.println("x = " + p.x + ", y = " + p.y); 
	} 
} 
