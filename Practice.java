import java.util.HashMap;
import java.util.Map;

public class Practice {
    public static void main(String[] args) {
        int[] arrayInput = {2,7,11,15};
        twoSum(arrayInput, 9);
    }
    public static int[] twoSum (int[] nums, int target){
int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i<nums.length; i++){
            int difference = target-nums[i];
            if(map.containsKey(difference)){
                return new int[]{map.get(difference), i};
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
