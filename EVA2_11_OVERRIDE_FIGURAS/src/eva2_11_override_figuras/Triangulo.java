
package eva2_11_override_figuras;


public class Triangulo {
    private double base;
    private double altura;
    private int cateto1;
    private int cateto2;
    private int hipot;

    public Triangulo() {
    base = 0;
    altura = 0;
    cateto1 = 0;
    cateto2 = 0;
    hipot = 0;
    }

    public Triangulo(double base, double altura, int cateto1, int cateto2, int hipot) {
        this.base = base;
        this.altura = altura;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.hipot = hipot;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public int getCateto1() {
        return cateto1;
    }

    public int getCateto2() {
        return cateto2;
    }

    public int getHipot() {
        return hipot;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setCateto1(int cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(int cateto2) {
        this.cateto2 = cateto2;
    }

    public void setHipot(int hipot) {
        this.hipot = hipot;
    }

      
    public double calcularArea(){
        return (base*altura)/2;
    }
    public double calcularPeri(){
       hipot = (int) Math.sqrt((cateto1*cateto1)+(cateto2*cateto2)); 
       return cateto1 + cateto2 + hipot;
    }
   
}
