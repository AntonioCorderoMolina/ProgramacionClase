package tema4;

import java.util.Scanner;

public class EjemploDiaSemana {
    
    public static void main(String[] args) {
        
    int dia;

    Scanner sc = new Scanner(System.in);

    System.out.print("\n Introduce el número del día de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5: {
            System.out.println(" Es un día entre semana");
        }   break;
        case 6:
        case 7: {
            System.out.println(" Fin de semana");
        }   break;

        default: {
            System.out.println("** Error: no se corresponde con ningún dia");
        }
    }
    
    sc.close();
    }
}