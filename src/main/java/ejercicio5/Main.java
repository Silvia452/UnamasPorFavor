package ejercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int m = sn.nextInt();
        System.out.println("Ingrese otro numero: ");
        int n = sn.nextInt();

        int gcd1 = Euclides.gcdRecursive(m, n);
        int gcd2 = Euclides.gcdIterative(m, n);
        int gcd3 = Euclides.gcdLambda.apply(m, n);

        System.out.println("El MCD de " + m + " y " + n + " es:");
        System.out.println("- " + gcd1 + " (recursivo)");
        System.out.println("- " + gcd2 + " (iterativo)");
        System.out.println("- " + gcd3 + " (expresión lambda)");

    }
}
