package my.fibonacci;

/**
 * Created by michal.dio on 15/05/2017.
 * <p>
 * f(n)= f(n-1)+f(n-2)
 * 0,1,1,2,3,5,8,13
 */
public class FibonacciRecursionCalculator extends FibonacciCalculator{


    @Override
    public int getFibonacci(int n) {
        int fib = 0;

        if (n == 0) {
            return fib;
        } else if (n == 1 || n == 2) {
            fib = 1;
        } else {
            fib = getFibonacci(n - 1)+getFibonacci(n-2);
        }
        return fib;

    }


}
