package my.fibonacci;

/**
 * Created by michal.dio on 05/05/2017.
 */
public class FibbonacciApp {

    public static void main(String[] args) {
        System.out.println("Running fibonacci ...");
        FibonacciOperations calc = new FibonacciRecursionCalculator();
        int sum = calc.sumFibonacci(5);
        System.out.println("Sum:"+sum);
    }
}
