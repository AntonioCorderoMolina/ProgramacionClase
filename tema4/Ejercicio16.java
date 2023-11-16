package tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio16 {

    /**
     * Escribe un programa que diga cuál es la primera cifra de un número entero 
     * positivo introducido por teclado. Se permiten números de hasta 5 cifras.
     * @author Antonio J. Sánchez
     * @author Jose David Quero
     */

    public static void main(String[] args) {
        
        int numero ;
        int digito = 0 ;
        Scanner entrada = new Scanner(System.in) ;

        try {
            System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
            numero = entrada.nextInt() ;
        
            // Si el número está comprendido entre 0 y 10, el primer dígito es el 
            // propio número
            if (numero < 0) {
                    System.out.println("Te he pedido números positivos, perla.");
            }
            else if   (numero < 10) {
                digito = numero ;

            } else if (numero < 100) {
                // Si el número es menor que 100 el primer dígito es igual al cociente 
                // de la división entre 10.        
                digito = numero / 10 ;

            } else if (numero < 1000) {
                // Si el número es menor que 1000 el primer dígito es igual al cociente 
                // de la división entre 100.        
                digito = numero / 100 ;

            } else if (numero < 10000) {
                // Si el número es menor que 10000 el primer dígito es igual al cociente 
                // de la división entre 1000.        
                digito = numero / 1000 ;

            } else if (numero < 100000) {
                // Si el número es menor que 100000 el primer dígito es igual al cociente 
                // de la división entre 10000.        
                digito = numero / 10000 ;
            }

            System.out.printf("El primer dígito del número introducido es el %d\n", digito);

        } catch (InputMismatchException ime) {

            System.out.println("Se esperaba un valor de tipo numérico entero. Se ha introducido una cadena.");

        }
        entrada.close();
    }
    
}


