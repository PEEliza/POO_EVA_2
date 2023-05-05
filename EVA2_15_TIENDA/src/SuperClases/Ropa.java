
package SuperClases;
//AUTOR: POLETH E. ESCARCEGA LOPEZ


abstract public class Ropa extends Producto {
   private String marca;
   private String color;

    public Ropa() {
    }


    public Ropa(String marca, String color, String nombre, String unidad, double precio) {
        super(nombre, unidad, precio);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
  
   
}
