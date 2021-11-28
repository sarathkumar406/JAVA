import java.util.*;
import java.util.stream.*;
class Streams 
{
	public static void main(String[] args) 
	{
		//Using map function to get result based on the expresssion
		 List<Integer> number = Arrays.asList(2,3,4,5);
		 List<Integer> square = number.stream().map(x->x * x).collect(Collectors.toList());
		//List squere = number.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println("numbers ------->> "+number);
		System.out.println("squere ------->> "+square);
		
		// filter --- used for select elements as per the Predicate passed as argument.
		List<String> names = Arrays.asList("Reflection","Streams","Collections","Sarath","Abi");
		List<String> res = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

		System.out.println("names ---------->>> "+names);
		System.out.println("res ---------->>> "+res);

		//Sort the elements using sorted method in streams
		List<String> res_sort = names.stream().sorted().collect(Collectors.toList());

		System.out.println("sorted list is ---->>> "+res_sort);
		//Array to List Convertion
		int[] a = {2,3,4,5};

		List<Integer> a_list = Arrays.stream(a).boxed().collect(Collectors.toList());

		System.out.println("List convertion to array -java8 -->>"+a_list);

		List<Integer> list = new ArrayList<>(a.length);
 
        for (int i : a) {
            list.add(Integer.valueOf(i));
        }
 
        System.out.println("List convertion to array -java7 -->> "+list);

		List<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(21);
		al.add(13);

		System.out.println("List before convertion --"+al);

		Integer[] it = al.stream().toArray(Integer[]::new);

		System.out.println(it);

		int[] pre_ar = al.stream().mapToInt(i->i).toArray();

		System.out.println(pre_ar.length);



	}
}
