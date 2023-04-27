
package eva2_17_interfaces;

/**
 *
 * @author pesca
 */
public abstract class Producto {
    private double precio;
    private String nombre;

    public Producto() {
    }

    public Producto(double precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
