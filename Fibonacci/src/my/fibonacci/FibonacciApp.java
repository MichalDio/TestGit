package my.fibonacci;

import java.util.Scanner;

/**
 * Created by michal.dio on 05/05/2017.
 */
public class FibonacciApp {

    public static void main(String[] args) {
        System.out.println("Running fibonacci ...");

        FibonacciOperations calc = new FibonacciRecursionCalculator();
        System.out.println("Hello, I'm fibonacci calculator. Insert the number of fibonaccis you want to sum. Thank you");
        int fibbNum = 0;

        Scanner sc = new Scanner(System.in);
        fibbNum = sc.nextInt();
        System.out.println("fibNum:" + fibbNum);

        int sum = calc.sumFibonacci(fibbNum);
        System.out.println("Sum:" + sum);
    }
}
