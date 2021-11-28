import java.util.LinkedHashMap;

public class HeapCheck {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Heap Memory", 10);
		lhm.put("Heap Memory", 20);
		lhm.put("Heap Memory", 30);
		lhm.put("Heap Memory", 5);
		
		lhm.put("Non Heap Memory", 10);
		lhm.put("Non Heap Memory", 30);
		lhm.put("Non Heap Memory", 40);
		lhm.put("Non Heap Memory", 70);
		
			for(Map.Entry<String,Integer> entry: lhm.entrySet()){
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
		
		
	}

}