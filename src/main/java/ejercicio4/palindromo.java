package ejercicio4;

public class palindromo {

    public static boolean esPalindromoRecursivo(String cadena) {
        if (cadena.length() <= 1) {
            return true;
        } else {
            if (cadena.charAt(0) == cadena.charAt(cadena.length()-1)) {
                return esPalindromoRecursivo(cadena.substring(1, cadena.length()-1));
            } else {
                return false;
            }
        }
    }

    public static boolean esPalindromoIterativo(String cadena) {
        int i = 0;
        int j = cadena.length() - 1;
        while (i < j) {
            if (cadena.charAt(i) != cadena.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
