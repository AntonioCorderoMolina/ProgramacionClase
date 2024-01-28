import java.util.Scanner;

public class Ejemplo5Clase {

    public static final int TAMANIO = 3;
    public static void main(String[] args) {

        int num;
        int fila;
        int columna;

        int [][] tabla = { {8, -12,  33},
                           {14,  1, -24},
                           {100, 51, 69}
                        };

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nDiga un número (1 a 8): ");
        num = sc.nextInt();

        // Con un bucle:
        /*
        for (fila=0 ; fila < 3 ; fila++){
        
            for (columna=0 ; columna<2 ; columna++){

                num--;

                if (num==0) {
                    System.out.println(tabla[fila][columna]);
                }
            }
        }
        */

        // Método más óptimo porque el bucle pasa por todo el array.

        fila = num/TAMANIO;
        columna = num%TAMANIO;

        System.out.printf("Valor de la tabla = %", tabla[fila][columna]);
        
                
        sc.close();
    }
}
