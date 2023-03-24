package ejercicio5;

public class Main {

    public static void main(String[] args) {
        int m = 24;
        int n = 16;

        int gcd1 = Euclides.gcdRecursive(m, n);
        int gcd2 = Euclides.gcdIterative(m, n);
        int gcd3 = Euclides.gcdLambda.apply(m, n);

        System.out.println("El MCD de " + m + " y " + n + " es:");
        System.out.println("- " + gcd1 + " (recursivo)");
        System.out.println("- " + gcd2 + " (iterativo)");
        System.out.println("- " + gcd3 + " (expresión lambda)");

    }
}
