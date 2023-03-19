
package eva2_10_override;
// AUTOR: POLETH E. ESCARCEGA LOPEZ


public class EVA2_10_OVERRIDE {

 
    public static void main(String[] args) {
        // TODO code application logic here
     Persona perso = new Persona(); // Instanciar
     Persona perso2 = new Persona ("Lili Castro", 28);
        System.out.println(perso); 
        System.out.println(perso2);
        
    }
    
}
 class Persona{
     private String nombre;
     private int Edad;

    public Persona() {
        this.nombre = "----";
        this.Edad = 0;
    }

    public Persona(String nombre, int Edad) {
        this.nombre = nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
     
     @Override
     public String toString(){
      
         // NO ESTAMOS INVOCANDO EL METODO SOBREESCRITO DE LA SUPER CLASE
         // AQUÍ ESTAMOS REMPLAZANDO TOTALMENTE A toString DE LA SUPER CLASE
         String cade = "Datos: " +  "\n" +
                    "Nombre: " + nombre + "\n" +
                    "Edad: " + Edad;
      return cade;
              
     }
 }