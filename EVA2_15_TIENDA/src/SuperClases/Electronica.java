
package SuperClases;
//AUTOR: POLETH E. ESCARCEGA LOPEZ


abstract public class Electronica extends Producto {
private String Fabricante;
private String Modelo;
private int garantia; // EN DIAS DE GARANTIA

    public Electronica() {
        super();
        this.Fabricante = " ";
        this.Modelo = " ";
        this.garantia = 0;
    }

    public Electronica(String Fabricante, String Modelo, int garantia, String nombre, String unidad, double precio) {
        super(nombre, unidad, precio);
        this.Fabricante = Fabricante;
        this.Modelo = Modelo;
        this.garantia = garantia;
    }



    public String getFabricante() {
        return Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    


}
