
package Computadora;
//AUTOR: POLETH E. ESCARCEGA LOPEZ


import SuperClases.Electronica;

public final class Computadora extends Electronica {
private double tama;
private int memoria;
private String procesador;
private String disco;

    public Computadora() {
        super();
        this.tama =  0;
        this.memoria = 0;
        this.procesador = " ";
        this.disco = " ";
    }

    public Computadora(double tama, int memoria, String procesador, String disco, String Fabricante, String Modelo, int garantia, String nombre, String unidad, double precio) {
        super(Fabricante, Modelo, garantia, nombre, unidad, precio);
        this.tama = tama;
        this.memoria = memoria;
        this.procesador = procesador;
        this.disco = disco;
    }


    public double getTama() {
        return tama;
    }

    public int getMemoria() {
        return memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getDisco() {
        return disco;
    }

    public void setTama(double tama) {
        this.tama = tama;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
   
    @Override
    public double precioVenta(int cant) {
    // 10 unidades --> el precio del 80%
    
    if (cant < 10)
        return precio * cant;
    else 
        return (precio * 0.8) * cant;
  }
    
}

/*Computadora es una clase final:
// ya no se puede heredar de una clase final
 class Laptop extends Computadora{
     
 }*/

/*Final:
constantes 
limitar la herencia
*/