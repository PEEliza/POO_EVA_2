
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author pescarcega
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*
        Circulo1 circ = new Circulo1(5);
        circ.imprimirDatos();
        Figuras fig = circ;
        System.out.println("AREA: " + fig.calcularArea());
        */
 // DECLARACION DE UN ARREGLO
       /* int datos [] = new int[10];
        Circulo1 [] circulos = new Circulo1[10];
        // UN ARREFGLO EN JAVA VA DE LA POSICIÓN 0 A LA N-1
        // N ES LA CANTIDAD DE ELEMENTOS DE UN ARREGLO
        circulos[0] = new Circulo1();
        circulos[0].calcularArea();
        
for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo1(i); // CREAR CADA UNO DE LOS OBJETOS
            circulos[i].imprimirDatos();
        } */
       // Con el Scanner vamos a capturar por el teclado la cantidad
       // de figuras a utilizar
       Figuras[] figuras;
       Scanner input = new Scanner (System.in);
        System.out.println("¿Cuantas figuras quieres capturar?");
        int cant = input.nextInt(); // Nos permite capturar
         figuras = new Figuras[cant]; // Creamos el arreglo con la cantidad de
                                      //figuras que quiere el usuario
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1.Circulo, 2.Triangulo");
            int figu = input.nextInt();
            
            if(figu == 1){ // Circulo
              Circulo1 circu = new Circulo1();
                System.out.println("INTRODUCE EL RADIO: ");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            }else{ // Triangulo
             Triangulo trian = new Triangulo();
             figuras[i] = trian;
                System.out.println("INTRODUCE LA BASE: ");
                trian.setBase(input.nextDouble());
                System.out.println("INTRODUCE LA ALTURA: ");
                trian.setAltura(input.nextDouble());
               
            }
        }
          // IMPRIMIR LOS RESULTADOS:
          for (int i = 0; i < figuras.length; i++) {
              if(figuras[i] instanceof Circulo1){
                  System.out.println("\nCIRCULO:");
                  Circulo1 circu = (Circulo1) figuras[i]; // Casting
                  circu.imprimirDatos();
              }
              
              else{
             System.out.println("\nTRIANGULO:");
             Triangulo trian = (Triangulo) figuras[i]; // Casting
             trian.imprimirDatos();
                      }
        }
    }
    
}
