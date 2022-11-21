public class Main {
    public static void main(String[] args) {
        private static long factorial(int n){
            long f = 1;
            for (int i = 1; i <= n; i++)
                f = f * i;


        }
        int n = 5;
        long fact;
        fact = factorial(n);
        System.out.println("The factorial of "+ n + " is "
                + fact + ".");


    }
}