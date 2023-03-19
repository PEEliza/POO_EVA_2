
package eva2_9_super_2;


// Clase derivada extends Clase Base
// Subclase extends Superclase
// Hijo extends Padre
// Estudiante is a-Persona
public class Estudiante extends Persona{
  private String noControl;

 // HAY QUE AGREGAR EL COSNTRUCTOR DEFAULT
  public Estudiante() {
    super(); // LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE 
    this.noControl = "----";
  }

    public Estudiante( String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad); // LLAMADA AL CONSTRUCTOR
        this.noControl = noControl;
    }
  
  

public String getNoControl() {
    return noControl;
    }

public void setNoControl(String noControl) {
    this.noControl = noControl;
    }


  @Override // OCULTA EL MÉTODO (CON LA MISMA FIRMA) EN LA SUPERCLASE, EN ESTE 
  // CASO, REEMPLAZA A imprimirDatos() de Persona.
  public void imprimirDatos(){
      /*System.out.println("Nombre: " + getNombre());
      System.out.println("Apellido: " + getApellido());
      System.out.println("Edad: " + getEdad());
      System.out.println("Numero de control: " + getNoControl());
      System.out.println("ESTUDIANTE!!");  */
 // NO TIENE CASO HACER LO MISMO QUE YA TIENES EN PERSONA, UTILIZA EL SUPER     
      
      super.imprimirDatos(); // VIENE DE PERSONA 
      System.out.println("No de control: " + noControl);
}
  
}
