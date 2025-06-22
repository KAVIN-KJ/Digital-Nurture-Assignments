package DataStructures_And_Algorithms.Financial_Forecasting;

public class Financial_Forecast_Recursion {

    public static double futureValue(double st, double r, int n) {
        if (n == 0) {
            return st;
        }
        return (1 + r) * futureValue(st, r, n - 1);
    }

    public static void main(String[] args) {
        double start = 10000;
        double rate = 0.1;
        int n = 5;

        double res = futureValue(start, rate, n);
        System.out.printf("Future Value after %d years: %.2f\n", n, res);
    }
}
