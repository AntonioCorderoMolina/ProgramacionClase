import java.util.Scanner;

public class esT3R1ej3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int pesetas;
        double euros;

        System.out.print("\n Introduzca la cantidad de pesetas que quiere convertir: ");
        pesetas = sc.nextInt();

        euros = (double) (pesetas / 166.3);

        System.out.printf("%d pesetas son %.2f euros", pesetas, euros);

    sc.close();
    }
}
