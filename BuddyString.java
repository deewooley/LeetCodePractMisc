public class BuddyString {
    public static void main(String[] args) {
//          budds("aaaaaaabc",
//                "aaaaaaacb");
        System.out.println(budds("aa",
                ""));
    }
    public static boolean budds(String A, String B) {
        char[] aArray = A.toCharArray();
        char[] bArray = B.toCharArray();
        int counter = 0;
        boolean output = true;
        int error = 0;
        String errors = "";


        if (aArray.length == 2 && bArray.length == 2 && aArray[0]==aArray[1] &&bArray[0]==bArray[1]) {
           if(A.equals(B)){output=false;}
            output =true;
        }

        else{
        if(aArray.length==0 || bArray.length==0){
            output = false;
        }
        if(aArray.length !=bArray.length){
            output=false;

        }
        else{


            for (int j = 0; j < bArray.length; j++) {
                if (aArray[j] != bArray[j]) {
                    errors += aArray[j] + bArray[j];
                    error = j;
//                    System.out.println(error);
//                    System.out.println(aArray[j] );
                    ++counter;
                }

            }
            if (errors.toCharArray().length <4|| counter>2) {
                output = false;
            }

            if (errors.toCharArray().length == 4) {
                if (errors.toCharArray()[0] == errors.toCharArray()[3] && errors.toCharArray()[1] == errors.toCharArray()[2] ) {
                    output = true;
                }
            }


        }
        }
        return output;
    }
}
