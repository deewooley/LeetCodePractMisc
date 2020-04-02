//video 23
public class ReverseString {
    public static void main(String[] args) {
        char [] input = {'H','e','l','l','o'};
//        revString(input);
        System.out.println(revString(input));

    }
    public static char[] revString(char[] s){
        int a = 0;
        int b = s.length-1;

        while(a<= b){
            char output = s[a];
            s[a]=s[b];
            s[b]=output;
            ++a;
            --b;
        }
        return s;
    }
}
