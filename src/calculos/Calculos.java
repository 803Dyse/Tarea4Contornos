package calculos;

import java.util.Scanner;

/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Calculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Programa que realiza calculos.
         */
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        final int SUMAR = 1;
        final int RESTAR = 2;
        final int MULTIPLICAR = 3;
        final int DIVIDIR = 4;

        System.out.println("Selecciona una opcion:");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");
        int opcion = sc.nextInt();

        System.out.println("Introduce el valor del primer numero");
        double x = sc.nextDouble();
        System.out.println("Introduce el valor del segundo numero");
        double y = sc.nextDouble();

        switch (opcion) {
            case 1:
                resultado = x + y;
                break;
            case 2:
                resultado = x - y;
                break;
            case 3:
                resultado = x * y;
                break;
            case 4:
                resultado = x / y;
                break;
        }
        System.out.println("El resultado de la operación es el siguiente:");
        System.out.println(resultado);
    }

}
