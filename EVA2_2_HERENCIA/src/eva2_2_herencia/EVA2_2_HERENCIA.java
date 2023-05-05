
package eva2_2_herencia;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class EVA2_2_HERENCIA {

    public static void main(String[] args) {
        // TODO code application logic here
        Docente docente = new Docente ("Eliz", "Lopez", 30, "Chihuahua");
        Estudiante estu = new Estudiante("Elizabeth", "Nevarez", 20,  "C225503274");
        Proveedores prov = new Proveedores ( "Sahid", "Vazquez", 28,"lalala", "SAV7532");
        
        System.out.println("DATOS DEL DOCENTE");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Apellido: " + docente.getApellido());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Plaza: " + docente.getPlaza());
        
        System.out.println("\nDATOS DEL ESTUDIANTE");
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: " + estu.getEdad());
        System.out.println("Numero de control: " + estu.getNoControl());
        
        System.out.println("\nDATOS DEL PROVEEDOR");
        System.out.println("Nombre: " + prov.getNombre());
        System.out.println("Apellido: " + prov.getApellido());
        System.out.println("Edad: " + prov.getEdad());
        System.out.println("RAZON SOCIAL: " + prov.getRazonSocial());
        System.out.println("RFC: " +  prov.getRfc());
    }
    
}
