import java.util.Scanner;;

public class exEj3AntonioCordero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double radioMayor;
        double radioMenor;
        double volumen;

        System.out.print("\033[1mVOLUMEN DE UN TOROIDE\033[0m\n");
        System.out.print("=====================\n");
        System.out.print("Introduzca el radio mayor (cms): ");
        radioMayor = sc.nextDouble();
        System.out.print("Introduzca el radio menor (cms): ");
        radioMenor = sc.nextDouble();
        
        volumen = (2*(3.1416*3.1416)*radioMayor*(radioMenor*radioMenor)) ;

        System.out.printf("El Volumen del toroide es de \033[1m\033[31m %.4f \033[0m\033[0m cm\u00B3", volumen);

    sc.close();
    }

}