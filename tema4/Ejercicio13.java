package tema4;


import java.util.Scanner;

public class Ejercicio13 {

    /**
     * Escribe un programa que pinte una pirámide rellena con un carácter introducido por 
     * teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El 
     * programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide 
     * está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
     * @author Antonio J. Sánchez
     * @author Jose David Quero
     */
    
    public static void main(String[] args) {
        
        int opcion ;
        char car ;        
        Scanner entrada = new Scanner(System.in) ;

        System.out.println("Este programa pinta una pirámide.") ;
        System.out.print("Introduzca el carácter de relleno: ") ;
        car = entrada.nextLine().charAt(0) ;

        System.out.println("Elija un tipo de pirámide: ") ;
        System.out.println("1. Con el vértice hacia arriba") ;
        System.out.println("2. Con el vértice hacia abajo") ;
        System.out.println("3. Con el vértice hacia la izquierda") ;
        System.out.println("4. Con el vértice hacia la derecha") ;
        System.out.print("? ") ;
        opcion = entrada.nextInt() ;

        System.out.println("\nSu píramide, gracias.\n") ;

        switch(opcion) {

            case 1:
                System.out.printf("  %c\n", car) ;
                System.out.printf(" %c%c%c\n", car, car, car) ;
                System.out.printf("%c%c%c%c%c\n", car, car, car, car, car) ;
                break ;
            case 2:
                System.out.printf("%c%c%c%c%c\n", car, car, car, car, car) ;
                System.out.printf(" %c%c%c\n", car, car, car) ;
                System.out.printf("  %c\n", car) ;
                break ;
            case 3:
                System.out.printf("  %c\n", car) ;
                System.out.printf(" %c%c\n", car, car) ;
                System.out.printf("%c%c%c\n", car, car, car) ;
                System.out.printf(" %c%c\n", car, car) ;
                System.out.printf("  %c\n", car) ;
                break ;
            case 4:
                System.out.printf("%c\n", car) ;
                System.out.printf("%c%c\n", car, car) ;
                System.out.printf("%c%c%c\n", car, car, car) ;
                System.out.printf("%c%c\n", car, car) ;
                System.out.printf("%c\n", car) ;
                break ;

        }

        entrada.close();
    }

}
