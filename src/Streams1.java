import java.util.*;
import java.util.stream.*;
class Streams1 
{
	public static void main(String[] args) 
	{
		//collect method
		int[] ar = {2,3,4,3,4,5};
		Set<Integer> ar_set = Arrays.stream(ar).boxed().collect(Collectors.toSet());
		List<Integer> numbers = Arrays.asList(2,3,4,5);
		Set<Integer> res = numbers.stream().map(x->x*x).collect(Collectors.toSet());

		System.out.println("numbers ---------> "+numbers);
		System.out.println("res ---------> "+res);
		System.out.println("ar_set ---------> "+ar_set);
		System.out.println();
		System.out.println("============================================");
		System.out.println();

		numbers.stream().map(x->x*x).forEach(y->System.out.print(y+" "));
		System.out.println();
		System.out.println("============================================");
		System.out.println();

		int even = numbers.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println("even --------->>> "+even);


	}
}
