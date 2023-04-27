
package eva2_20_vehiculo;

/**
 *
 * @author pescarcega
 */
public class Automovil {
private String placas;
private String modelo;  

    public Automovil() {
    }

    public Automovil(String placas, String modelo) {
        this.placas = placas;
        this.modelo = modelo;
    }

    public String getPlacas() {
        return placas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
