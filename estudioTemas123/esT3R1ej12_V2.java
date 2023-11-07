public class esT3R1ej12_V2 {
    
    public static void main(String[] args) {
        
        double notaPrimera;
        double notaDeseada;
        double notaSegunda;

        String linea;

        System.out.print("\nIntroduzca la nota del primer examen: ");
        linea = System.console().readLine();
        notaPrimera = Double.parseDouble(linea) ;

        System.out.print("¿Qué nota quieres sacar en el trimestre: ");
        linea = System.console().readLine();
        notaDeseada = Double.parseDouble(linea);

        notaSegunda = ((notaDeseada - (notaPrimera*0.4))/0.6);

        System.out.printf("Para tener un %.2f en el trimestre necesita sacar un %.2f en el segundo exámen", notaDeseada, notaSegunda);

    }

}
