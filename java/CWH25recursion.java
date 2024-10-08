public class CWH25recursion {
    // Factorial calculation
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Fibonacci series calculation
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("The value of factorial of " + n + " is: " + factorial(n));

        int fibonacciNumber = 10;
        System.out.println("The value of the " + fibonacciNumber + "th Fibonacci number is: " + fibonacci(fibonacciNumber));
    }
}


        
   
