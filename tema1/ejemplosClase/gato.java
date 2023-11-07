package ejemplosClase;

public class gato {
    //Crear propiedades
    String raza, color, sexo ;
    int    edad ;
    double peso ;
        //Crear métodos (comportamiento)
    void maulla() {
        System.out.println("Miauu") ;
    }
    void duerme() {
        System.out.println("Zzzzz") ;
    }
    void come() {
        System.out.println("Ñam!") ;
    }
    void ronronea() {
        System.out.println("Brrrr") ;
    }
}
    //objetos. Son instancias de la clase Gato
    /*  Son ejemplos, los objetos no van aquí por ahora
Gato garfield = new Gato() ;
Gato silvestre = new Gato() ;

garfield.maulla() ; */