
package eva2_2_herencia;
// AUTOR: POLETH E. ESCARCEGA LOPEZ


public class Proveedores {
    private String nombre;
    private String apellido;
    private int edad;
    private String razonSocial;
    private String rfc;

    public Proveedores() {
    }

    public Proveedores(String nombre, String apellido, int edad, String razonSocial, String rfc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
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

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRfc() {
        return rfc;
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

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
}
