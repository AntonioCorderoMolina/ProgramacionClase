public class esT3R1ej5 {
    
    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;

        String linea;

        System.out.print("\nIntroduzca la longitud de la base (cm): ");
        linea = System.console().readLine();
        base = Double.parseDouble(linea);

        System.out.print("Introduzca la longitud de la altura (cm): ");
        linea = System.console().readLine();
        altura = Double.parseDouble(linea);


        area = base * altura;

        System.out.printf("El área de un rectángulo es %.1f cm^2", area);   
    }
}