import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MissingNumbers {
	public static List<Integer> findMissing(int [] nums){
		HashSet<Integer> set = new HashSet<>();
		List<Integer> missinglist = new ArrayList<>();
		
		for(int num: nums) {
			set.add(num);
		}
		
		for(int i = 1;i < nums.length + 1 ;i++) {
			if(!set.contains(i)) {
				missinglist.add(i);
			}
		}
		
		return missinglist;
	}
	public static void main(String[] args) {
		int [] nums = {4,2,3,7,8,1,2,3};
		System.out.println(findMissing(nums));
	}

}