// Print Fibonacci series 

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // initializing first two variables
        int firstValue = 0, secondValue = 1;
        // taking input from user number of elements to be printed
        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();

        // prints first and second value
        System.out.println(firstValue);
        System.out.println(secondValue);

        int fib = 0;
        for (int i = 0; i < limit; i++) {
            fib = firstValue + secondValue; // sum of previous elements
            firstValue = secondValue; // inside first value second value gets initialized
            secondValue = fib; // in second value sum of previous elements get stored
            System.out.println(secondValue);
        }
        input.close();
    }

}
