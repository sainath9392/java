import java.util.Arrays;

public class Sorting {
	public static void main(String [] args) {
		int[] arr = {5,2,8,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.stream(arr).forEach(num -> System.out.print(num + " ") );
	}
}