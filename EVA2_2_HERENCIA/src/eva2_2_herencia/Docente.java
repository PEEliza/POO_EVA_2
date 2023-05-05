
package eva2_2_herencia;
// AUTOR: POLETH E. ESCARCEGA LOPEZ


public class Docente {
    private String nombre;
    private String apellido;
    private int edad;
    private String plaza;

    public Docente() {
    }

    public Docente(String nombre, String apellido, int edad, String plaza) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.plaza = plaza;
    }
   
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    
}
