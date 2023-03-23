import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenido, escoja la opción para ejecutar el programa");
        System.out.println("1. Función bisectriz");
        System.out.println("2. Algoritmo iterativo, lamba ");
        System.out.println("3. Convertir número decimal");
        System.out.println("4. Palíndromo");
        System.out.println("5. Algoritmo de Euclides");
        System.out.println("6. Salir");
        Scanner sn = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 6) {
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ejecutando función bisectriz");
                    ejercicio1.Main.main(args);
                    break;
                case 2:
                    System.out.println("Ejecutando algoritmo iterativo, lamba");
                    ejercicio2.Main.main(args);
                    break;
                case 3:
                    System.out.println("Ejecutando convertir número decimal");
                    ejercicio3.Main.main(args);
                    break;
                case 4:
                    System.out.println("Ejecutando palíndromo");
                    ejercicio4.Main.main(args);
                    break;
                case 5:
                    System.out.println("Ejecutando algoritmo de Euclides");
                    ejercicio5.Main.main(args);
                    break;
                case 6:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

    }
}
