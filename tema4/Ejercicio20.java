package tema4;

import java.util.Scanner;

public class Ejercicio20 {

    /**
     * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una 
     * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. 
     * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da 
     * por hecho que el usuario introducirá un día y hora correctos, anterior al 
     * viernes a las 15:00h.
     */
    public static void main(String[] args) {
        
        int horas ;
        int minutos ;
        int total = 0 ;
        String diaSemana ;
        Scanner entrada = new Scanner(System.in) ;

        System.out.print("Introduce un día de la semana (de lunes a viernes): ");
        diaSemana = entrada.nextLine().toLowerCase() ;

        System.out.println("A continuación introduce la hora (hora y minutos): ");
        System.out.print("Hora: ");
        horas = entrada.nextInt() ;

        System.out.print("Minutos: ");
        minutos = entrada.nextInt() ;


        // 1 hora = 60 minutos
        // 1 día  = 24 horas = 24 * 60 = 1440 minutos cada día de la semana
        //
        // 15:00 = han pasado 15 horas del viernes => 16 * 60 = 900 minutos

        switch(diaSemana) {

            case "lunes"    :
                total = 3 * 1440 + 900 ;    // de martes a viernes
                total += ((24 - horas) * 60) - minutos ;
                //total += 1440 - (horas * 60) - minutos ;
                break ; 
            case "martes"   :
                total = 2 * 1440 + 900 ;    // de miércoles a viernes
                total += ((24 - horas) * 60) - minutos ;
                //total += 1440 - (horas * 60) - minutos ;
                break ;
            case "miercoles":
                total = 1440 + 900 ;    // jueves
                total += ((24 - horas) * 60) - minutos ;
                //total += 1440 - (horas * 60) - minutos ;
                break ;
            case "jueves"   :
                total = 900 ;    // hasta viernes
                total += ((24 - horas) * 60) - minutos ;
                //total += 1440 - (horas * 60) - minutos ;
                break ;
            case "viernes"  :                
                total =  ((15-horas) * 60) - minutos ;                
                break ;
        }

        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", total);

        entrada.close();
    }
}
