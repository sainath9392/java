import java.util.*;
public class hashMaps {
	public static void main(String [] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "sai");
		map.put(2, "sana");
		map.put(3,"others");
		System.out.println(map.containsKey(1));
		System.out.println(map.get(1));
		System.out.println(map.remove(3));
		System.out.println(map);
	}
	
}
