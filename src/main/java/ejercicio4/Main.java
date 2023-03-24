package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese una cadena: ");
        String cadena = sn.nextLine();
        if (cadena.length() == 0) {
            System.out.println("La cadena no puede estar vacia");
            return;
        }
        if (palindromo.esPalindromoIterativo(cadena)) {
            System.out.println("La cadena es palindromo de forma iterativa");
        } else {
            System.out.println("La cadena no es palindromo");
        }
        if (palindromo.esPalindromoRecursivo(cadena)) {
            System.out.println("La cadena es palindromo de forma recursiva");
        } else {
            System.out.println("La cadena no es palindromo");
        }


    }
}
