import java.util.Scanner;;

public class exEj2AntonioCordero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroVueltas;
        int anyo;

        System.out.print("\033[1m VUELTAS A LA TIERRA \033[0m\n");
        System.out.print("============================\n");
        System.out.print("Introduzca el numero de años: ");
        anyo = sc.nextInt();

        numeroVueltas = anyo * 365;

        System.out.printf("La Tierra ha dado un total de %d vueltas en %d años", numeroVueltas, anyo);

    sc.close();
    }

}
