
package eva2_7_this;

public class EVA2_7_THIS {

// this es una referencia a una instancia de la clase
    // todos los objetos tienen this
    // pueden usar this en cualquiero objeto
    
    public static void main(String[] args) {
        // TODO code application logic here
        // imprimir();
        // No se puede usar this en este contexto estatico
    }
   
    public void imprimir(){
    // Aquí también es visible this
}
}
 
class Persona{
 private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    } // this.nombre es el atributo de la calse
    // nombre es la variable (parámetro) declarado en el método.
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
 
 public void imprimirDatos(){
     System.out.println("El nombre es: " + this.nombre);
 }
 }
