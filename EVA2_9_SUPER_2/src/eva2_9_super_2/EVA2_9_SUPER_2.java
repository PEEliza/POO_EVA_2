
package eva2_9_super_2;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class EVA2_9_SUPER_2 {

  
    public static void main(String[] args) {
        // TODO code application logic here
       Estudiante estudiante = new Estudiante("Poleth","Lopez", 18, "N22550326");
       estudiante.imprimirDatos();
        System.out.println("Numero de control: " + estudiante.getNoControl());
    
    Docente docen = new Docente (); // DATOS DEFAULT
    docen.imprimirDatos();
        System.out.println("Plaza: " + docen.getPlaza());
        
    Proveedores prov = new Proveedores ("Chuy", "Nevarez", 28, "CHN253816");
    prov.imprimirDatos();
        System.out.println("RFC: " + prov.getRfc());
    }
    
}
