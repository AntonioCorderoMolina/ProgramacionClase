import java.util.Scanner;

public class Ejemplo2Clase {

    /*
     * Escribre un programa que lea 10 números por teclado y que luego los muestre en orden inverso, 
     * es decir, el primero que se introduce es el último en mostrarse y viceversa
     */
    public static void main(String[] args) {
        
        int i;

        int[] numeros = new int[10];
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nPor favor, introduzca 10 números enteros.");
            System.out.println("Pulse la tecla INTRO después de introducir cada número.");

            for (i = 0; i < 10; i++) {
                numeros[i] = sc.nextInt();
            }

            System.out.println("Los números introducidos, al revés, son los siguientes:");

            // Mostrar los números en orden inverso
            for (i = 9; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }

            sc.close();
        }
    }
}
