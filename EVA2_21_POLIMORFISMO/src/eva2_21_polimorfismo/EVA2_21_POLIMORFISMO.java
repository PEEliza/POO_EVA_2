
package eva2_21_polimorfismo;

/**
 *
 * @author pescarcega
 */
public class EVA2_21_POLIMORFISMO {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante1 est = new Estudiante1("Gael", "Montes", 21, "LC25149");
        est.imprimirDatos();
        Docente1 docs = new Docente1("Liza", "Reyes", 38, "Chihuahua");
        docs.imprimirDatos();
        
        // ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE A UNA VARIABLE
        // DE TIPO PERSONA
        Persona1 perso = est;
       //ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona1 perso2 = docs; 
        Persona1 perso3= new Persona1();
      /* ES IMPOSIBLE CONVERTIR A UNA PERSONA EN UN ESTUDIANTE, NO PODDEMOS AGREGAR
        COSAS, SIMPLEMENTE OCULTAMOS PROPIEDADES
        Estudiante1 estudiante = perso3;*/
    }
    
}
