package tema4;

import java.util.Scanner;

public class Ejercicio26 {

    /**
     * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce 
     * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción 
     * incorrecta, el programa deberá mostrar un mensaje de error.
     * @author Antonio J. Sánchez
     * @author Jose David Quero
     */

     public static void main(String[] args) {
        

        String jugador1 ;
        String jugador2 ;
        Scanner entrada = new Scanner(System.in) ;

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ") ;
        jugador1 = entrada.nextLine().toLowerCase() ;

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ") ;
        jugador2 = entrada.nextLine().toLowerCase() ;

        switch(jugador1) {

            case "piedra" :
                if      (jugador2.equals("piedra")) { System.out.println("Empate"); }
                else if (jugador2.equals("papel"))  { System.out.println("Gana el jugador 2"); }
                else if (jugador2.equals("tijera")) { System.out.println("Gana el jugador 1"); } 
                else {}
                break ;

            case "papel"  :
                if      (jugador2.equals("piedra")) { System.out.println("Gana el jugador 1"); }
                else if (jugador2.equals("papel"))  { System.out.println("Empate"); }
                else                                         { System.out.println("Gana el jugador 2"); } 
                break ;

            case "tijera" :
                 if     (jugador2.equals("piedra")) { System.out.println("Gana el jugador 2"); }
                else if (jugador2.equals("papel"))  { System.out.println("Gana el jugador 1"); }
                else                                         { System.out.println("Empate"); } 
                break ;

        }


entrada.close();
     }
}
