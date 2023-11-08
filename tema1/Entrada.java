import java.util.Locale;
import java.util.Scanner;

public class Entrada {
    
    public static void main(String[] args) {
        
        //String nombre ;
        //System.out.print("¿Cómo te llamas? ") ;

        //nombre = System.console().readLine() ;  // LEER nombre

        //System.out.println("Hola, "+ nombre + ", bienvenido/a.") ;


        //String linea ;
        //System.out.print("Introduce un número entero: ") ;
        //linea = System.console().readLine() ;

        //int numeroEntero ;
        //numeroEntero = Integer.parseInt(linea) ;
        //System.out.printf("El número es: %d\n", numeroEntero) ;
        //System.out.printf("El doble del número es: %d\n", 2 * numeroEntero) ;

        //System.out.print("Introduce un número real: ") ;
        //linea = System.console().readLine() ;

        //float numeroReal ;
        //numeroReal = Float.parseFloat(linea) ;
        //System.out.printf("El número es: %.2f\n", numeroReal) ;


        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH) ;
        
        //String nombre  ;
        //System.out.print("¿Cómo te llamas? ") ;
        //nombre = sc.nextLine() ;

        //int edad ;
        //System.out.print("¿Qué edad tienes? ") ;
        //edad = sc.nextInt() ;

        //System.out.println("Bienvenido/a, " + nombre + ", tienes " + edad + " años.") ;

        //System.out.print("Introduce tu nombre y tu edad separados por espacio: ") ;
        //String nombre ;
        //nombre = sc.next() ;

        //int edad ;
        //edad = sc.nextInt() ;
        
        //System.out.println("Bienvenido/a, " + nombre + ", tienes " + edad + " años.") ;

        System.out.print("Introduce tres números (pueden contener decimales) separados por espacio: ") ;        

        double x1 = sc.nextDouble() ; 
        double x2 = sc.nextDouble() ;
        double x3 = sc.nextDouble() ;

        double media = (x1 + x2 + x3) / 3 ;

        System.out.printf("Los números son: %f, %f y %f y la media es %.2f\n", x1, x2, x3, media) ;

        sc.close();
    }
}
