package ejercicio1;

public class algoritmoImplementado {

    static final double N = 2;

    public static double bisectIter(double min, double max, double prec) {
        double med = (min + max) / 2;
        while (max - min >= prec) {
            med = (min + max) / 2;
            if (f(min) * f(med) < 0) {
                max = med;
            } else {
                min = med;
            }
        }
        return med;
    }

    static double f(double x) {
        return x*x - N;
    }

}
