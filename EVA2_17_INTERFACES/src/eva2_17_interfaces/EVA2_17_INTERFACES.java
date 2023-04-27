
package eva2_17_interfaces;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class EVA2_17_INTERFACES {

    public static void main(String[] args) {
        // TODO code application logic here
        
      //MostrarDatos Md = MostrarDatos();  
      Persona pers = new Persona("Eliza Lopez", 74);
      pers.imprimirDatos();
      Computadora compu = new Computadora("intel CORE i3", 12, 15000, "Asus X515");
      compu.imprimirDatos();
    }
    
}
