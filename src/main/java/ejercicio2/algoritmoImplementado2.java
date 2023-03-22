package ejercicio2;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class algoritmoImplementado2 <I extends Number, I1 extends Number> {

    void factorizarIterativo(int num) {
        int div = 2;
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
