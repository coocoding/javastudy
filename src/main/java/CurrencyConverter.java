public class CurrencyConverter {
    private static double rate;

    public static double toDollar(double won) {
        return won/rate;
    }

}
