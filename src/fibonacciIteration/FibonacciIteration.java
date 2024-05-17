package fibonacciIteration;

public class FibonacciIteration {

    public static long fibonacci(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        long result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);
    }
}


//Часова складність: O(n)
//Просторова складність: O(1)