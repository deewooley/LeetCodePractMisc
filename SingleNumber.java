import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int[] list = {2,2,1};
    singleNum(list);
        //System.out.println(singleNum(list));
    }
    public static int singleNum(int[] input){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int repeat = 0;
//        for(int i= 0; i<input.length; i++){
//            for(int j= 1; j<input.length; j++){
//            if(map.containsValue(input[j])) {
//                repeat= input[j];
//            }
//            }
        int i = 1;
        int j = 0;
        while(i<input.length){
            if(map.containsValue(input[i])){}
        }
        }
        Arrays.toString();
    return repeat;
    }
}
