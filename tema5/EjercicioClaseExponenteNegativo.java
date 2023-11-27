package tema5;

import java.util.Scanner;

public class EjercicioClaseExponenteNegativo {
    
    public static void main(String[] args) {

        int base;
        int exponente;
        int cont = 0;
        double resultado = 0;
        double divisor;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\n Introducza la base: ");
        base = sc.nextInt();
        System.out.print(" Introducza el exponente negativo: ");
        exponente = sc.nextInt();

        exponente = Math.abs(exponente);

        divisor = base;
        
        while (cont <= exponente) {
            resultado = 1 / divisor; 
            divisor = divisor * base;
            cont ++;
        }

        System.out.printf(" %d^-%d = %f\n", base, exponente, resultado);

    sc.close();
    }
}