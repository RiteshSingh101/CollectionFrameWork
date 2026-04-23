package Map;

import java.util.TreeMap;

public class GPT {
	public static void main(String[] args) {
		TreeMap<String, Integer> t1 = new TreeMap<String,Integer>();
		t1.put("ABC",1);
		t1.put("BCA",2);
		t1.put("BAC",3);
		t1.put("ACB",4);
		t1.put("CBA",5);
		System.out.println(t1);
	}
}
