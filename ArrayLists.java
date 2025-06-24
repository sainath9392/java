import java.util.*;

public class ArrayLists {
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,1,4));
        Collections.sort(list);
        System.out.println(list);
		Collections.sort(list,(a,b)->b-a);
		System.out.println(list);
	}
}
