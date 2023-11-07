import java.util.Scanner;;

public class exEj5AntonioCordero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int segundosEntrada;
        double minutos;
        double horas;
        double segundos;
    
        System.out.print("\033[1mCALCULADORA DE TIEMPO\033[0m\n");
        System.out.print("=====================\n");
        System.out.print("Introduzca la cantidad de segundos: ");
        segundosEntrada = sc.nextInt();

        //1 hora = 60 minutos
        //60 minutos = 3600 segundos
        horas = (((double) segundosEntrada) / 3600);
        minutos = (horas / 60);
        segundos = (int) Module (segundosEntrada);

        System.out.printf("%d segundos son \033[1m\033[48;5;11m%.0f horas\033[0m, \033[1m\033[48;5;9m%.0f minutos \033[0m y  \033[1m\033[48;5;10m%.0f segundos\033[0m.", segundosEntrada, horas, minutos, segundos);

    sc.close();
    
    }

    private static int Module(int segundosEntrada) {
        return 0;
    }

}