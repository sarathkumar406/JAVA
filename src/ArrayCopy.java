import java.util.*;
class ArrayCopy 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4};

		int[] b = new int[a.length];
		
		int c[] = Arrays.copyOf(a, 3);

		System.arraycopy(a,0,b,0,3);

		System.out.println(a[0]);
		System.out.println(b[0]);
		
		for(int i =0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		
		System.out.println();

		for(int i =0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		
	}
}
