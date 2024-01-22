import java.util.Scanner;

public class Ejemplo2Clase {

    /*
     * Escribre un programa que lea 10 números por teclado y que luego los muestre en orden inverso, 
     * es decir, el primero que se introduce es el último en mostrarse y viceversa
     */

    //public static final int TAMANIO = 10;

    public static void main(String[] args) {
        
        int i;

        int[] numeros = new int[10];
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nPor favor, introduzca 10 números enteros.");
            //System.out.printf("\nPor favor, introduzca %d números enteros.", TAMANIO);
            System.out.println("Pulse la tecla INTRO después de introducir cada número.");

            //for (i = 0 ; i < TAMANIO ; i++)
            for (i = 0; i < 10; i++) {
                numeros[i] = sc.nextInt();
            }

            System.out.println("Los números introducidos, al revés, son los siguientes:");

            // Mostrar los números en orden inverso
            //for (i=(TAMANIO-1); i >= 0 ; i--)
            for (i = 9; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }

            sc.close();
        }
    }

    /*
    public static void leerArra(int[] numero) {
        
        int indice ; 

        for (indice = 0; indice < TAMANIO ; indice++) {
            numeros[indice] = Integer.parseInt(System.console{}.readLine{}) ;
        }
    }
    */
}
