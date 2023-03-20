package ejercicio2;

public class algoritmoImplementado2 {

    public static void fIter(int num, int div) {
        while (num > 1) {
            if (num % div == 0) {
                System.out.println(div);
                num /= div;
            } else {
                div++;
            }
        }
    }

}
