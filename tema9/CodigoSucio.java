package tema9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Práctica código sucio.
* @author Antonio J.Sánchez
* @author José David Quero
*/

public class CodigoSucio {
    public static void main(String[] args) {

        String caracterCirculo;

        int opcion;
        int num;

        char caracterRombo;
        int altura;

        Scanner s = new Scanner(System.in);

        try {

            do {

                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                opcion = s.nextInt();

                switch (opcion) {

                    case 0:
                        break;

                    case 1:

                        do {
                            s.nextLine();
                            System.out.print("Escribe un símbolo: ");
                            caracterCirculo = s.nextLine();
                            System.out.print("Introduce un valor entero positivo:");
                            num = s.nextInt();

                            if (num < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }

                        } while (num < 0);
                            
                        pintarCirculo(num, caracterCirculo);
                    
                    break;

                    case 2:

                        System.out.print("Escribe un símbolo: ");
                        caracterCirculo = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        caracterRombo = caracterCirculo.charAt(0);

                        altura = s.nextInt();

                        if ((altura > 0) && ((altura % 2) != 0)) {
                            pintarRombo(altura, caracterRombo);
                        } else {
                            System.out.println("El valor debe ser positivo e impar.");
                        }

                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcion != 0);

        } catch (InputMismatchException ime) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    /**
     * Función para pintar un círculo.
     * @param radio
     * @param x
     */
    private static void pintarCirculo(int radio, String num) {

        int cont;
        int j;

        for (cont = -radio ; cont <= radio ; cont++) {
            for (j = -radio ; j <= radio ; j++) {
                if ((((cont * cont) + (j * j)) <= (radio * radio)) && (((cont * cont) + (j * j)) > ((radio - 2) * (radio - 1)))) {
                    System.out.printf("%s ", num);
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    /**
     * Función para pintar un rombo.
     * @param altura
     * @param w
     */
    private static void pintarRombo(int altura, char w) {

        int anchoRombo;
        int cont;
        int caracterRombo;

        anchoRombo = altura / 2;

        for (cont = 0; cont < altura; cont++) {
            for (caracterRombo = 0; caracterRombo < altura; caracterRombo++) {

                if (cont < altura / 2) {
                    if ((caracterRombo == anchoRombo) || (caracterRombo == (altura - anchoRombo - 1))) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if ((caracterRombo == anchoRombo) || (caracterRombo == (altura - anchoRombo - 1))) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if (cont < (altura / 2)) {
                anchoRombo--;
            } else {
                anchoRombo++;
            }

            System.out.println();
        }
    }
}
