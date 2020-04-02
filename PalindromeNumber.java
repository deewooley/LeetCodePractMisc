//vid 12
    public class PalindromeNumber {
        public static void main(String[] args) {
            palindromeNumbers(101);

            //palindromeNumbers(121);
        }
        public static boolean palindromeNumbers(int x) {
            if (x == 0) {
                return true;
            }

            if (x < 0 || x % 10 == 0) {
                return false;
            }
            int reversed_int = 0;
            while (x > reversed_int) {
                int pop = x % 10;
                System.out.println(pop);
                System.out.println(reversed_int);
                x=x/=10;
                System.out.println(x);

                reversed_int = (reversed_int * 10) + pop;
                System.out.println(reversed_int);
            }
            if (x == reversed_int || x == reversed_int / 10) {
                return true;
            } else {
                return false;
            }
        }
    }

