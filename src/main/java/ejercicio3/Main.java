package ejercicio3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        numeroConvertir numero = new numeroConvertir();
        System.out.println(numero.decimalToHex(255));
        System.out.println(numero.decimalToBase(13, 2));


    }
}
