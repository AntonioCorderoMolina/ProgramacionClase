import java.util.Scanner;

public class Ejemplo6Clase {
    /*
     * Define en JAVA un array bidimensional de tamaño 3x3 y solicita al usuario
     * los elementos que debe contener cada una de sus celdas. 
     * Hecho esto, muestra por pantalla el contenido del array por filas 
     */

    private static final int TAMANIO = 3;
    public static void main(String[] args) {

        int x;  //fila
        int y;  //columna

        // definir array
        int[][] cuadrante = new int[TAMANIO][TAMANIO];

        Scanner sc = new Scanner(System.in);

        System.out.println("");

        // bucle para dar valores a la celda una por una
        for (y=0 ; y < TAMANIO ; y++) {
            for (x=0 ; x < TAMANIO ; x++){
                System.out.printf("Para la posición [%d][%d]. ", x, y);
                System.out.print("Valor de la celda: ");
                cuadrante[x][y] = sc.nextInt();
            }
        }

        System.out.println("");
        
        // mostrar resultado
        for (y=0 ; y < TAMANIO ; y++) {
            for (x=0 ; x < TAMANIO ; x++){
                System.out.printf("%d ", cuadrante[x][y]);
            }
            System.out.println("");
        }

        sc.close();
    }
}
