public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
       // factorial(5);
        //N! = Nx(N-1)x(N-2)x... x 2 x 1

    }
    public static int factorial (int A){
        if(A<=1) {
            return 1;
        }
        else{
            return (A*factorial(A-1));
        }
    }
}
