public class HolaMundo {
    public static void main(String[] args) {
        //System.out.println("¡Hola Mundo!") ;    // ESCRIBIR CON SALTO
        //System.out.print("En esta línea ") ;    // ESCRIBIR SIN SALTAR
        //System.out.println("No se salta") ;     // ESCRIBIR CON SALTO

        System.out.println("\033[30m¡Hola mundo!") ;
        System.out.println("\033[31m¿Qué tal estáis?") ;
        System.out.println("\033[32m\033[4mVamos a pasarlo bien programando\033[0m\u2591") ;
        System.out.println("\033[33mHoy es miércoles") ;
        System.out.println("\033[34mQuedan dos días de JAVA") ;
        System.out.println("\033[35m¡Vamos a aprovecharlos a tope!") ;
        System.out.println("\033[36mNo sé qué más decir") ;
        System.out.println("\033[35m¡Hasta luego!\033[0m") ;

        System.out.println("\033[38;5;36m\033[3mNo puedes pasar!\033[0m") ;
        System.out.println("\033[48;2;103;219;119m\033[30m\033[1mGoonies never die!\033[0m") ;
        

        System.out.printf("El número %d no tiene decimales.\n", 4) ;
        System.out.printf("El número %f sale con decimales.\n", 21.0) ;
        System.out.printf("El número %.3f sale exactamente con %d decimales.\n", 21.0,3) ;
        System.out.printf("El valor es el 100%%. \n") ;

        // SALTO DE LÍNEA
        System.out.printf("Al final de la línea se produce un salto.\n") ;

        // TABULACIÓN
        System.out.printf("\tComenzamos con una tabulación.\n") ;

        // COMILLAS DOBLES EN UNA CADENA DE CARACTERES
        System.out.printf("Las cadenas de caracteres se encierran entre \".\n") ;

        // BARRA INCLINADA A LA IZQUIERDA DENTRO DE CADENA DE CARACTERES
        System.out.printf("Usamos la barra \\ para caracteres de escape.\n") ;

        // COMILLAS SIMPLES 
        System.out.println('\'') ;

        // ##############################################################################
        // %[orden][flag][.precisio]tipo
        // ORDEN: numero$
        System.out.printf("Mostramos el valor %d y el valor %d.\n",10,4) ;
        System.out.printf("Mostramos el valor %2$d y el valor %1$d.\n",10,4) ;

        // FLAG #########################################################################
        // 1.) numero
        // 2.) 0numero
        // 3.) +
        // 4.) -numero
        System.out.printf("FLAGS\n#################\n",100) ;
        System.out.printf("%8d\n",50) ;
        System.out.printf("%08d\n",100) ;
        System.out.printf("%+d\n",1432) ;
        System.out.printf("%-8dHola qué tal?\n",531) ;

         // PRECISIÓN #####################################################################
         System.out.printf("PRECISIÓN\n#################\n",100) ;
          System.out.printf("%.4f\n",25.876532157) ;
          System.out.printf("%.8s\n","¡Hola mundo!") ;


        

    }

}
