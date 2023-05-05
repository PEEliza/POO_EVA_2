
package SuperClases;
import SuperClases.Ropa;
//AUTOR: POLETH E. ESCARCEGA LOPEZ

abstract public class Playera extends Ropa {
    private String tipo;
    private String talla;

    public Playera(String tipo, String talla) {
        this.tipo = tipo;
        this.talla = talla;
    }

    public Playera(String tipo, String talla, String marca, String color, String nombre, String unidad, double precio) {
        super(marca, color, nombre, unidad, precio);
        this.tipo = tipo;
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double precioVenta(int cant){
     if (cant <10)
         return getPrecio() * cant;
     else
         return (getPrecio() * 0.8) * cant;
    }
    
}
