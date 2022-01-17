import static java.lang.Math.abs;

public class GoodCalc extends Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum=0;
        for (int i : a) {
            sum+=i;
        }
        return sum/a.length;
    }
}
