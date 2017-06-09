package my.fibonacci;

/**
 * Created by michal.dio on 02/06/2017.
 */
public abstract class FibonacciCalculator implements FibonacciOperations{

    @Override
    public int sumFibonacci(int n) {
        int[] fibSeq = new int[n + 1];
        int sum = 0;
        for (int i = 0; i < n + 1; i++) {
            fibSeq[i] = getFibonacci(i);
            sum+=fibSeq[i];
            System.out.println(i+":"+fibSeq[i]);
        }
        return sum;
    }

    @Override
    public abstract int getFibonacci(int n);


}
