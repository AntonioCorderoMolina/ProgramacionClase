import java.util.Scanner;

public class esT3R1ej12 {

    public static void main(String[] args) {
     
    double notaPrimera;
    double notaDeseada;
    double notaSegunda;
    
    Scanner sc = new Scanner(System.in) ;

    System.out.print("\nIntroduzca la nota del primer examen: ");
    notaPrimera = sc.nextDouble() ;

    System.out.print("¿Qué nota quieres sacar en el trimestre: ");
    notaDeseada = sc.nextDouble();

    //notaSegunda = ((notaDeseada - (notaPrimera*0.4))/0.6)
    notaSegunda = ((notaDeseada - (notaPrimera*0.4))/0.6);

    System.out.printf("Para tener un %.2f en el trimestre necesita sacar un %.2f en el segundo exámen", notaDeseada, notaSegunda);

    sc.close();
    }   
}