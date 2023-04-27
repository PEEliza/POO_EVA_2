
package eva2_24_collections;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
import java.util.ArrayList;

/**
 *
 * @author pescarcega
 */
public class EVA2_24_COLLECTIONS {

    public static void main(String[] args) {
        // TODO code application logic here
        // COLLECTIONS --> CONTENEDORES
        ArrayList miArreglo = new ArrayList();
        miArreglo.add(new Persona());
        miArreglo.add(new Perro());
        miArreglo.add(new Automovil());
        
        ArrayList <Integer> miArreglo2 = new ArrayList <Integer>();
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        System.out.println(miArreglo2);

    }
    
}
class Persona{
    
}
class Perro{
    
}
class Automovil{
    
}