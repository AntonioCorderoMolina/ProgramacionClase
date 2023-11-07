import java.util.Scanner;

public class esT3R1ej9 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura;
        double radio;
        double volumen;

        System.out.println(" Volumen de un cono\n ------------------");
        System.out.print(" Introduzca la altura (cm): ");
        altura = sc.nextDouble();
        System.out.print(" Introduzca el radio de la base (cm): ");
        radio = sc.nextDouble();
        volumen = (((3.1416*(radio*radio)*altura))/3);
        System.out.printf(" El volumen del cono es de %.10f", volumen);
    
    sc.close();
    }

}
