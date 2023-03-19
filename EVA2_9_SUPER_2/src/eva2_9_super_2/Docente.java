
package eva2_9_super_2;

// Docente is a-Persona
public class Docente extends Persona {
    private String plaza;

    public Docente() {
    }
    
    public Docente(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

   
   
    
}
