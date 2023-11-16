import java.util.Scanner;

public class Ejercicio15 {
    
    /**
     * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
     * @author Antonio J. Sánchez
     * @author Jose David Quero
     */

    public static void main(String[] args) {

        int numero ;
        int digito ;  
        String respuesta ;      
        Scanner entrada = new Scanner(System.in) ;

        System.out.println("Introduce un número entero: ") ;        
        numero = entrada.nextInt() ;

        // limpiamos el buffer de teclado
        entrada.nextLine() ;

        System.out.println("¿Desea introducir otro número? (s/n): ") ;
        respuesta = entrada.nextLine() ;

        if (respuesta.equals("s")) { 

            System.out.println("Pido otro número...");
        }

        System.out.println("Numero = " + numero);
        System.out.println("Respuesta = " + respuesta) ;


        //digito = numero % 10 ;
        //System.out.printf("El último dígito del número introducido es %d\n", digito);



    }
}
