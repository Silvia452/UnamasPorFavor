package ejercicio5;

import java.util.function.BiFunction;

public class Euclides {
    public static int gcdRecursive(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcdRecursive(n, m % n);
        }
    }

    // Implementación iterativa del algoritmo de Euclides
    public static int gcdIterative(int m, int n) {
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }

    public static BiFunction<Integer, Integer, Integer> gcdLambda =
            (m, n) -> n == 0 ? m : Euclides.gcdLambda.apply(n, m % n);



}
