
package eva2_13_figuras_abstractas;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA2_13_FIGURAS_ABSTRACTAS {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Figura1 fig = new Figura1(); NO SE PUEDEN CREAR OBJETOS (INSTANCIAS)
               Circulo circ = new Circulo(24);
        System.out.println("ÁREA DEL CIRCULO: " + circ.calcularArea());
        System.out.println("PERÍMETRO DEL CIRCULO: " + circ.calcularPeri());
        
        Triangulo tri = new Triangulo(4.5,7.5,10,15,5);
        System.out.println("ÁREA DEL TRIANGULO: " + tri.calcularArea());
        System.out.println("PERÍMETRO DEL TRIANGULO: " + tri.calcularPeri());
    }
    
}
