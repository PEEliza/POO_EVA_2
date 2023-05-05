
package SuperClases;
//AUTOR: POLETH E. ESCARCEGA LOPEZ


abstract public class Producto {
    private String nombre;
    private String unidad; // kilos, docenas   
    protected double precio; // El protected tiene visibilidad entre clases relacionadas  por herencia
    // atributos y métodos
    // Funcionona como default (a nivle de paquete es visible) y permite a las subclases acceso

    public Producto() {
    }

    public Producto(String nombre, String unidad, double precio) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUnidad() {
        return unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
       abstract public double precioVenta (int cant);

}
