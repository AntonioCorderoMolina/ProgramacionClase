import java.util.Scanner;

public class esT3R1ej6 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.print("\n Área de un triágulo\n -------------------");
        
        System.out.print("\n Introduzca la longitud de la base (cm): ");
        base = sc.nextDouble();
        
        System.out.print(" Introduzca la longitud de la altura (cm): ");
        altura = sc.nextDouble();


        area = ((base * altura)/2);

        System.out.printf(" El área de un triángulo es %.1f cm^2", area);

    sc.close();
    }
}
