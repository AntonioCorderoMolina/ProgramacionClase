package tema4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio18 {


    public static void main(String[] args) {
        
        int numero ;
        boolean capicua = false ;
        Scanner entrada = new Scanner(System.in) ;

        try {
            System.out.println("Introduce un número entero (de 5 cifras como máximo): ");
            numero = entrada.nextInt() ;        

            // Si el número está comprendido entre 0 y 10, el primer dígito es el 
            // propio número
            if (numero < 0) {
                System.out.println("Te he pedido números positivos, perla.");
            } else if (numero < 10) {
                // una cifra
                capicua = true ;
            } else if (numero < 100) {
                // dos cifras
                capicua =  ((numero / 10) == (numero % 10)) ;            
            } else if (numero < 1000) {
                // tres cifras
                capicua =  ((numero / 100) == (numero % 10)) ;
            } else if (numero < 10000) {
                // cuatro cifras
                capicua = ((numero / 1000) == (numero % 10)) && ((numero / 100) % 10) == ((numero / 10) % 10) ;
            } else if (numero < 100000) {
                // cinco cifras
                capicua = ((numero / 10000) == (numero % 10)) && ((numero / 1000) % 10) == ((numero / 10) % 10) ;
            }

            //
            System.out.printf("El número introducido \033[1m%s es capicua.\033[0m\n\n", (capicua==false)?"no":"");

        } catch (InputMismatchException ime) {
            //
            System.out.println("Se esperaba un valor de tipo numérico entero. Se ha introducido una cadena.");
        } finally {
            entrada.close() ;
        }
entrada.close();
    }
    
}
