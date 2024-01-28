import java.util.Scanner;

public class Ejemplo7Clase {

    /*
     * Escribre un programa que genere 100 numeros aleatorios del 0 al 20 y que los muestre por pantalla separados por espacios.
     * 
     * El programa pedirá entonces por teclado dos valores y a continuación cambiará todas las ocurrencias del primer valor por el 
     * segundo en la lista generada anteriormente. Los numeros que se han cambiado deben aparacerecer entrecomillados.
     * 
     */

    public static final int N = 100;
    public static final int MAX = 21;
    
    public static void main(String[] args) {
        
        int patron;
        int remplazo;

        int[] numeros = new int[N];

        Scanner sc = new Scanner(System.in);

        System.out.println(""); // Salto de línea

        // Inicializar el array con 100 números
        inicializarArray(numeros);

        // Mostrar los 100 números genereados del array
        mostrarArray(numeros);
        
        System.out.println("\n"); // Salto de línea

        System.out.print("Introduzca un número de los que se han mostrado: ");
        patron = sc.nextInt();

        System.out.print("Introducza el valor por el que quiere sustituirlo: ");
        remplazo = sc.nextInt();

        System.out.println("");
        // Mostra resultado
        remplazar(numeros, patron, remplazo);

        System.out.println("");

        sc.close();
    }
  
    /**
     * Función para generar 100 números y guardar en el array
     * @param numeros
     */
    public static void inicializarArray(int[] numeros){

        int i;

        for (i=0 ; i < N ; i++) {
            
            // Guarda en array
            numeros[i] = (int) (Math.random()*MAX);
        }
    }

    /**
     * Función para mostrar el array
     * @param numeros
     */
    public static void mostrarArray(int[] numeros){

        // ForEach para mostrar el array
        for(int item : numeros) {
            System.out.printf("%d ", numeros[item]);
        }
    }

    /**
     * Reemplaza y muestra los valores del array que coinciden con el valor dado como reemplazo.
     * @param numeros
     * @param patron
     * @param remplazo
     */
    public static void remplazar(int[] numeros, int patron, int remplazo){

        for(int item : numeros) {

            if (item == patron) {
                System.out.printf("\"%d\" ", remplazo);
            } else {
                System.out.printf("%d ", item);
            }
        }
    }
}
