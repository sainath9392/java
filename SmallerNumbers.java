import java.util.*;

public class SmallerNumbers {
    public static int [] smallerNumbers(int [] nums){
        int [] temp = nums.clone();
        Arrays.sort(temp);

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], i);
            }
        }

        int [] result = new int [nums.length] ;

        for(int i = 0;i < nums.length;i++){
            result[i] = map.get(nums[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbers(nums)));
    }
}