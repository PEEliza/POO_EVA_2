
package eva2_9_super_2;

 
public class Proveedores extends Persona {
   private String rfc;

    public Proveedores() {
    }

    public Proveedores(String nombre, String apellido, int edad, String rfc) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
   
   
}
