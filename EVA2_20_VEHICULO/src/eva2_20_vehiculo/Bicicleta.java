
package eva2_20_vehiculo;

/**
 *
 * @author pescarcega
 */
public class Bicicleta {
   private String tamaño;
   private String tipo;

    public Bicicleta() {
    }

    public Bicicleta(String tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
    

    public String getTamaño() {
        return tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
   
}
