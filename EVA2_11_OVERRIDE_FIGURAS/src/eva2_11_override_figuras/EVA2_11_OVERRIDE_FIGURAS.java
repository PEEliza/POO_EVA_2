
package eva2_11_override_figuras;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA2_11_OVERRIDE_FIGURAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circ = new Circulo(18);
        System.out.println("ÁREA DEL CIRCULO: " + circ.calcularArea());
        System.out.println("PERÍMETRO DEL CIRCULO: " + circ.calcularPeri());
        
        Triangulo tri = new Triangulo(52,25,15,10,5);
        System.out.println("ÁREA DEL TRIANGULO: " + tri.calcularArea());
        System.out.println("PERÍMETRO DEL TRIANGULO: " + tri.calcularPeri());
        
    }
    
}
