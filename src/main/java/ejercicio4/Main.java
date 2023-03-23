package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sn.nextLine();
        System.out.println(palindromo.esPalindromoRecursivo(cadena));
        System.out.println(palindromo.esPalindromoIterativo(cadena));

    }
}
