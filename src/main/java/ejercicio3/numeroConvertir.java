package ejercicio3;

import org.w3c.dom.ls.LSOutput;

import java.util.function.BiFunction;
import java.util.function.Function;

public class numeroConvertir {

    public static String decimalToHex(int decimal) {
        return Integer.toHexString(decimal);
    }

    public static String decimalToBase(int decimal, int base) {
        return Integer.toString(decimal, base);
    }
    // Para la conversión de decimal a hexadecimal
    Function<Integer, String> decimalToHex = decimal -> Integer.toHexString(decimal);

    // Para la conversión de decimal a base B
    BiFunction<Integer, Integer, String> decimalToBase = (decimal, base) -> Integer.toString(decimal, base);


}
