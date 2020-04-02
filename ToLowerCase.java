public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("MoNTy pYthON AnD tHE HoLY gRAiL"));
//        toLowerCase("MoNTy pYthON AnD tHE HoLY gRAiL");
    }
    public static String toLowerCase(String input){
//        String output = "";
////        for(char c:input.toCharArray()){
////            if(Character.isUpperCase(c)){
////                output+=(char)(c+32);
////            }
////            else{
////                output+=c;
////            }
////        }
////        return output;
        return input.toLowerCase();
    }

}
