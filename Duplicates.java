import java.util.HashSet;

public class Duplicates {
	public static boolean containDuplicates(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}
	
	public static void main(String [] args) {
		int [] nums = {1,2,3};
        int [] nums2 = {1,1,2,3,4};
		System.out.println(containDuplicates(nums));
		System.out.println(containDuplicates(nums2));
	}
	
}