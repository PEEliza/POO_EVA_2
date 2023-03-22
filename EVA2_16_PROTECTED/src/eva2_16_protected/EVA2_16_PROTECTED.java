
package eva2_16_protected;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA2_16_PROTECTED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SuperClase SpC = new SuperClase();
        SpC.dato = 74;
    }
    
}
class SuperClase{
    protected int dato;
    
    
}
class Subclase extends SuperClase{
    public void imprimirDato(){
        System.out.println("EL VALOR DEL DATO ES: " + dato);
    }
    
}