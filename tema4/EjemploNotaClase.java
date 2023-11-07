package tema4;

import java.util.Scanner;

public class EjemploNotaClase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("¿Qué nota has sacado en el último examen? ");
        nota = sc.nextDouble();

        if ((nota >= 5) && (nota <= 10)) {
            System.out.println("Has aprobado");
        } else if ((nota >= 0) && (nota < 5)) {
            System.out.println("Has suspendido");
            } else {
                System.out.println("Valor introducido inválido");
            }
    
    sc.close();
    }

}
