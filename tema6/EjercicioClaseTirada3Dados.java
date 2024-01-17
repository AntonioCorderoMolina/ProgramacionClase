package tema6;

/*
 * Ejemplo de Clase:
 * Simular la tirada de 3 dados
 */

public class EjercicioClaseTirada3Dados {

    public static void main(String[] args) {
        
        //int dado1 = 1;
        //int dado2 = 1;
        //int dado3 = 1;

        /************ Opción 1 (no óptimo) ************/

        //dado1 = tiradaDado();
        //dado2 = tiradaDado();
        //dado3 = tiradaDado();
        
        //System.out.printf("\nTirada de 3 dados: %d %d %d\n", dado1, dado2, dado3);
        //System.out.printf("Suma= %d\n", (dado1 + dado2 + dado3));

        
        /****************** Opción 2 con función (opción guay) **************/

        System.out.print("\nTirada de 3 dados: ");
        System.out.printf("\nSuma= %d\n", tiradaDado());


        /*********** Opción 3 (ternario) ************/

        /*
        String a;
        int suma = 0;
        System.out.print("\nTirada de 3 dados: ");

        for (int i=1; i <= 3; i++){

            dado1 = (int) ((Math.random()*6)+1);

            suma = suma + dado1;

            if (i==3) {
                a = "=";
            } else {
                a = "+";
            }

            //System.out.printf("%d %s ", dado1, a);
            System.out.printf("%d %s ", dado1, (i==3)?"=":"+");
            
        }
        System.out.printf("%d", suma);
        */
    }

    /**
     * Función que devuelve la tirada de 3 dados
     * @param int intento
     * @return int numtirada
     */
    public static int tiradaDado() {

        int numTirada = 1;
        int suma = 0;

        int i;

        for (i = 1 ; i <= 3 ; i++) {
            numTirada = (int) ((Math.random()*6)+1);
            System.out.printf("%d ", numTirada);
            suma = suma + numTirada;

        }

        return suma;
    }

}

