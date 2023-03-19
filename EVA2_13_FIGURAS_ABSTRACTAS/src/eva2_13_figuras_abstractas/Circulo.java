
package eva2_13_figuras_abstractas;


public class Circulo extends Figura1 {
     private double radio; 
       public Circulo() {
        radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
     
     @Override
    public double calcularArea(){
     return Math.PI * (radio * radio);  
     }
   
     @Override
    public double calcularPeri(){
       return Math.PI * (radio * 2);
       
   }
}
