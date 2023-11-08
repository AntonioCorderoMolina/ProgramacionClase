public class Variables {
    
    public static void main(String[] args) {

        //int numero = 5 ;

        //System.out.printf("El valor de la variable es %d\n", numero) ;
        //System.out.println("El valor de la variable es " + numero) ;

        //double x ;
        //double y ;

        //x = 7 ;
        //y = 25.75 ;

        //System.out.println("El valor de x es " + x) ;
       
        //System.out.printf("El valor de x es %.0f\n", x) ;
        //System.out.printf("El valor de y es %.0f\n", y) ;

         //System.out.println("El valor de y es " + y) ;


         //char letra1 = 'c' ;
         //char letra2 = 'a' ;
         //char letra3 = 's' ;
         //char letra4 = 'a' ;

         //System.out.println("La primera letra es " + letra1) ;
         //System.out.println("Todas las letras forman la palabra " + letra1 + letra2 + letra3 + letra4) ;

         //System.out.println(letra1) ;
         //System.out.println(letra2) ;
         //System.out.println("" + letra1 + letra2 + letra3 + letra4) ;

         //int x = 97 ;
         //System.out.printf("Valor: %c\n", x) ;

         int x = 2 ;
         int y = 9 ;

         double division ;

         division = y / x ;
         System.out.println("y/x = " + division);

         division = (double) (y / x) ;
         System.out.println("(double) (y/x) = " + division);

         division = (double) y / (double) x ;
         System.out.println("(double) y/ (double) x = " + division);

         division = (double) y / x ;
         System.out.println("(double) y/ x = " + division);

         division = y / (double) x ;
         System.out.println("y/ (double) x = " + division);

    }

}
