public class FibonacciRecursion {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired Fibonacci number you want to find
        long result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: Fibonacci of 0 is 0, and Fibonacci of 1 is 1
        } else {
            // Recursive case: Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
