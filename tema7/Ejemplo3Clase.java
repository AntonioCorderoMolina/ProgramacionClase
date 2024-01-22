import java.util.Scanner;
/*
    Escribre un programa que lea 10 números por teclado y que luego los muestre en orden inverso, 
    eligiendo por orden eligiendo la opción es decir, el primero que se introduce es el último en mostrarse y viceversa
*/

public class Ejemplo3Clase {

    public static final int TAMANIO = 5;
    public static void main(String[] args) {
        
        int i;
        int op;

        int[] numeros = new int[TAMANIO];
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("\nPor favor, introduzca 10 números enteros.");
            System.out.println("Pulse la tecla INTRO después de introducir cada número.");

            for (i = 0; i < TAMANIO ; i++) {
                numeros[i] = sc.nextInt();
            }

            System.out.printf("\nMarque una opcion 1 / 2 para mostrar los números por orden o al revés: (1=al revés / 2=por orden)");
            op = sc.nextInt();

            mostrarArray(op, numeros);
            
            sc.close();
        }
    }

    /**
     * Función que muestra los números por orden o al revés.
     * @param op
     * @param numeros
     */
    public static void mostrarArray(int op, int[] numeros) {

        int i;

            switch (op) {
                // Mostrar los números en orden inverso
                case 1:
                    System.out.println("Los números introducidos, al revés, son los siguientes:");

                    for (i = (TAMANIO-1); i >= 0; i--) {
                        System.out.print(numeros[i] + " ");
                    }
                    break;

                // Mostrar los números por orden
                case 2:
                    System.out.println("Los números introducidos, por orden, son los siguientes:");

                    for (i = 0; i <= (TAMANIO-1); i++) {
                        System.out.print(numeros[i] + " ");
                    }
                    break;
            
                default:
                    System.out.println("ERROR. Opción no válida"); 
                    break;
            }
    }

}
