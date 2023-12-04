package tema5;

import java.util.Scanner;

public class EjercicioClaseExponenteNegativo {
    
    public static void main(String[] args) {

        int numero;
        int posicion;
        int divisor;

        int parte1;
        int parte2;

        int i;

        Scanner sc = new Scanner(System.in);
        sc.close();

        System.out.print("\n Introduce un número entero positivo: ");
        numero = sc.nextInt();

    // El número tiene 2 digitos??
        if (numero < 10) {
            System.out.println(" El número debe tener al menos dos dígitos.");
            sc.close();
            return;
        }

        System.out.print(" Introduce la posición a partir de la cual quieres partir el número: ");
        posicion = sc.nextInt();

    // Calcular la longitud del número
        int longitud = contarDigitos(numero);

    // Calcular las dos partes del número
        divisor = 1;

        for ( i = 1; i < (longitud - posicion + 1); i++) {
            divisor *= 10;
        }

        parte1 = numero / divisor;
        parte2 = numero % divisor;

        System.out.printf(" Los números partidos son el %d y el %d.\n", parte1, parte2);

    sc.close();
    }
    
    /**
     * Función para contar el número de dígitos en un número
     * @param num
     * @return
     */
    private static int contarDigitos(int num) {
        int cont = 0;
        while (num != 0) {
            num /= 10;
            cont++;
        }
        return cont;
    }
}