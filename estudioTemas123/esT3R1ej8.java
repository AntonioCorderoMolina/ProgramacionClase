public class esT3R1ej8 {
    
    public static void main(String[] args) {
        
        double horas;
        int computo;
        double salario;

        String linea;


        System.out.print("\n Introduzca el número de horas trabajadas durante la semana: ");
        linea = System.console().readLine();
        horas = Double.parseDouble(linea);

        computo = 12;
        salario = horas * computo;

        System.out.printf(" Su salario semanal es de %.2f euros", salario);
    }

}
