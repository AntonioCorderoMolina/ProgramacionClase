package ejemplosClase;

public class holamundo {
    public static void main(String[] args){
        /* Escribe el mensaje hola mundo */
        System.out.println("Hola Mundo") ;              //Esto es como la función Escribir en pseudo
        System.out.print("En esta linea") ;             //Escribe sin salto de línea
        System.out.println(" no se salta") ;            //Escribir con salto de línea

        System.out.println("\033[30m 30 = Color gris") ;    //Escribe la línea con formato de color
        System.out.println("\033[31m 31 = Color rojo") ;
        System.out.println("\033[32m 32 = Color verde") ;
        System.out.println("\033[33m 33 = Color amarillo") ;
        System.out.println("\033[34m 34 = Color azul") ;
        System.out.println("\033[35m 35 = Color morado") ;
        System.out.println("\033[36m 36 = Color azul claro") ;
        System.out.println("\033[37m 37 = Color blanco \033[0m") ;
            //color texto
        System.out.println("\033[33;46mHola, \033[36mhola, \033[0mcaracola.") ;
            //color RGB Texto
        System.out.println("\033[38;2;103;219;119m Goonies never die") ;
            //color RGB Fondo
        System.out.println("\033[48;2;103;219;119m Goonies never die\033[0m") ;
            //color RGB Fondo + Color texto
        System.out.println("\033[48;2;103;219;119m\033[30m Goonies never die\033[0m") ;

        System.out.println("\033[38;5;36m\033[3m No puedes pasar") ;
        System.out.println("\033[48;5;103;219;119m\033[30m\033[1m Goonies never die\033[0m") ;
            //UNICODE
        System.out.println("\u263A") ;
        System.out.println("\u263B") ;

            //Modificadores de formato
        System.out.printf("El número %d no sale decimales.\n", 21) ;
        System.out.printf("El número %f sale decimales.\n", 21.0) ;
        System.out.printf("El %.3f sale exactamente con %d ddecimales.\n", 21.0, 3) ;
    }
}