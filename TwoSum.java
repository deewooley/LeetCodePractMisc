import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
int[] arrayInput = {2,7,11,15};
        System.out.println(twoSumed(arrayInput,9));
}
public static int[] twoSumed(int[] nums, int target){
        //create int array w param
        int[] result = new int[2];
    //create hashmap
    HashMap<Integer, Integer>map = new HashMap<Integer, Integer>();
    //for loop
    for(int i = 0; i<nums.length;i++){
        //int calculating the difference btw num at array and dist to target
        int difference = target-nums[i];
        //if map contains key = difference
        if(map.containsKey(difference)){

            //return new array difference, and i
            return new int[] {map.get(difference),i};
        }
        //put input[] nums[i],i
        map.put(nums[i],i);
    }
    return result;
}
    }