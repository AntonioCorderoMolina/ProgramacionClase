public class EjArrays {

    public static void main(String[] args) {
        
        //definimos el array
        int[] numeros ;

        //guardamos memoria para 5 celdas de memoria
        numeros = new int[5] ;

        //insetar valores en cada celda
        numeros[0] = 20 ;
        numeros[1] = 10 ;
        numeros[2] = 35 ;
        numeros[3] = 4  ;
        numeros[4] = 1  ;

        //mostrar valores del array
        System.out.println("\nLos valores del array son los siguientes: ");
        System.out.printf("%d, %d, %d, %d, %d\n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);

    }
}
