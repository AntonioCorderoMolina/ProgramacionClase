import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo1Clase {

    public static void main(String[] args) {
        
        //definir array y variables
        int celda;
        int[] numeros ;

        // inicializar array al definirlo
        // int[] numeros = {8, 3, 200, 150, 11}

        Scanner sc = new Scanner(System.in);

        //inicializar array
        numeros = new int[5];

        //dar valores al array
        numeros[0] = 8;
        numeros[1] = 33;
        numeros[2] = 200;
        numeros[3] = 150;
        numeros[4] = 11;

        System.out.print("\nQué índice de celda quiere (0 a 4) ? ");

        try {
            celda = sc.nextInt();
            /*
            switch (celda) {
                case 0:
                    System.out.printf("valor = %d", numeros[0]);
                break;
                
                case 1:
                    System.out.printf("valor = %d", numeros[1]);
                break;

                case 2:
                    System.out.printf("valor = %d", numeros[2]);
                break;

                case 3:
                    System.out.printf("valor = %d", numeros[3]);
                break;

                case 4:
                    System.out.printf("valor = %d", numeros[4]);
                break;
            
                default:
                    break;
            }
            */
        
            /******* CORRECIÓN:  */ 

            System.out.printf("El valor de la celda es %d", numeros[celda]);
            

        } catch(InputMismatchException ime) {
            System.out.println("ERROR, valor no váido");
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("ERROR, la celda excede los límites");
        }
        
    sc.close();
    }

}
