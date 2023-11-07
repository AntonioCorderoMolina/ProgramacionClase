import java.util.Scanner;;

public class exEj6AntonioCordero {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigoArticulo;
        double precioArticulo;
        int unidadesVendidas;
        double descuento;
        double iva;
    
        //Scanner sc = new Scanner(System.in);  -> Scanner va aquí debajo de las variables

        System.out.print("\n\033[1mTANGO MODAS\033[0m\n");
        System.out.print("=====================\n");
        System.out.print("Introduce código de artículo: ");
        codigoArticulo = sc.nextInt();
        System.out.print("Introduce precio: ");
        precioArticulo = sc.nextDouble();
        System.out.print("Introduce unidades vendidas: ");
        unidadesVendidas = sc.nextInt();
        System.out.print("Introduce descuento (%): ");
        descuento = sc.nextDouble();

        // iva en el ejercicio = 16%
        iva = 16;

        System.out.print("\nSu ticket:\n");

        //RESULTADO

        System.out.print("\n\033[1mTANGO MODAS\033[0m\n");
        System.out.print("=====================\n");
        System.out.printf("%d\t\t%.2f€\n", codigoArticulo,precioArticulo);
        System.out.printf("%d unidades\t%.2f€\n", (unidadesVendidas),(precioArticulo*unidadesVendidas));
        System.out.printf("%.2f %%\t\t-%.2f€\n", descuento,((precioArticulo*unidadesVendidas)*(descuento/100)));
        System.out.printf("%.2f %% IVA\t+%.2f€\n", iva,((precioArticulo*unidadesVendidas)*(iva/100)));
        
        System.out.printf("\033[1m\033[48;5;250mTOTAL\t\t%.2f €\033[0m\n", ((precioArticulo*unidadesVendidas))+((precioArticulo*(iva/100))));
        
    sc.close();
    
    }

}