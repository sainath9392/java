import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static int [] findIndices(int[] nums, int target) {
		Map<Integer,Integer> hashmap = new HashMap<>();
		for(int i = 0; i < nums.length;i++) {
			int diff = target - nums[i];
			if(hashmap.containsKey(diff)) {
				return new int [] {i, hashmap.get(diff)};
			}
			hashmap.put(nums[i] ,i);
			
		}
		return new int[] {};
	}
	public static void main(String [] args) {
		int[] nums = {11,2,3,7,4};
		int target = 9;
		System.out.println(Arrays.toString(findIndices(nums,target)));
	}
}