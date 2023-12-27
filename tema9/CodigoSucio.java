package tema9;

import java.util.Scanner;

/**
* Práctica código sucio.
* @author Antonio J.Sánchez
* @author José David Quero
*/

public class CodigoSucio {
    public static void main(String[] args) {

        String t;

        int m;
        int x;
        char j;
        int a;

        Scanner s = new Scanner(System.in);

        try {

            do {

                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                m = s.nextInt();

                switch (m) {

                    case 0:
                        break;

                    case 1:

                        do {
                            System.out.print("Escribe un símbolo: ");
                            t = s.next();
                            System.out.print("Introduce un valor entero positivo:");
                            x = s.nextInt();

                            if (x < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }
                        } while (x > 0);

                        f1(x, t.charAt(0));
                    break;

                    case 2:
                        System.out.print("Escribe un símbolo: ");
                        t = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        j = t.charAt(0);

                        a = s.nextInt();

                        if ((a > 0) && ((a % 2) != 0)) {
                            pintarRombo(a, j);
                        } else {
                            System.out.println("El valor debe ser positivo e impar.");
                        }

                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (m != 0);

        } catch (Exception e) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    private static void f1(int r, char x) {

        int i;
        int j;

        for (i = -r; i <= r; i++) {
            for (j = -r; j <= r; j++) {
                if ((((i * i) + (j * j)) <= (r * r)) && (((i * i) + (j * j)) > ((r - 2) * (r - 1)))) {
                    System.out.print(x + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    private static void pintarRombo(int a, char w) {

        int e;
        int i;
        int j;

        e = a / 2;

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {

                if (i < a / 2) {
                    if ((j == e) || (j == (a - e - 1))) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if ((j == e) || (j == a - e - 1)) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if (i < a / 2) {
                e--;
            } else {
                e++;
            }

            System.out.println();
        }
    }
}
