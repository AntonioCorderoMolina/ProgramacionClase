public class esT3R1ej2 {
    
    public static void main(String[] args) {
    
        double euros;
        double pesetas;

        String linea;

        System.out.print("\nIntroduzca la cantidad de euros que quiere convertir: ");
        linea = System.console().readLine();
        euros = Double.parseDouble(linea);

        //1€ = 166.3pesetas

        pesetas = (int) (euros * 166.3);

        System.out.printf("%.2f euros son %.0f pesetas", euros, pesetas);



    }
}
