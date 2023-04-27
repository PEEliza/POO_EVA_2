
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author pescarcega
 */
public class Circulo1 implements Figuras, MostrarDatos{
    private double radio;

    public Circulo1() {
    }

    public Circulo1(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
       return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPeri() {
     return Math.PI * (radio * 2);  
    }
    
    public void imprimirDatos(){
        System.out.println("\nCIRCULO");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPeri());
    }
    
}
