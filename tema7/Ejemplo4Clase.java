import java.util.Scanner;

public class Ejemplo4Clase {

    public static void main(String[] args) {
    
        //int[] numeros = new int[TAMANIO]

        int fila;
        int columna;

        int [][] tabla = { {8, -12,  33},
                           {14,  1, -24},
                           {100, 51, 69}
                        };

        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nfila: ");
        fila = sc.nextInt();
        System.out.print("columna: ");
        columna = sc.nextInt();
        
        System.out.printf("valor de la tabla = %d\n", tabla[fila][columna]);
                
        sc.close();
    }
}
