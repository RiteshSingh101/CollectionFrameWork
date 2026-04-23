package Map;

import java.util.Map;
import java.util.HashMap;
public class Google {
	public static void main(String[] args) {
		Map<Integer,String> h1 = new HashMap<Integer,String>();
		h1.put(1, "Swiggy");
		h1.put(2,"Zomato");
		h1.put(3, "Dmart");
		System.out.println(h1);
		System.out.println(h1.get(1));
		System.out.println(h1.containsKey(3));
		System.out.println(h1.isEmpty());
		System.out.println(h1.containsValue("Zomato"));
		System.out.println(h1.size());
		h1.remove(1);
		System.out.println(h1);
		System.out.println(h1.keySet());
		h1.clear();
		System.out.println(h1);
	}
}
