
package eva2_21_polimorfismo;

// Docente is a-Persona
public class Docente1 extends Persona1 {
    private String plaza;

    public Docente1() {
    }
    
    public Docente1(String nombre, String apellido, int edad,String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
  public void imprimirDatos(){
    super.imprimirDatos(); // VIENE DE PERSONA 
      System.out.println("Plaza: " + plaza);
  }
   
    
}
