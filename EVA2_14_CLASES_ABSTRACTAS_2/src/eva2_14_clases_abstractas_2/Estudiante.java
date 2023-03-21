
package eva2_14_clases_abstractas_2;


public class Estudiante extends Persona {
private String NoControl;
    
public Estudiante() {
    NoControl = " ";
    }

    public Estudiante(String NoControl, String nombre, int edad) {
        super(nombre, edad);
        this.NoControl = NoControl;
    }

    public String getNoControl() {
        return NoControl;
    }

    public void setNoControl(String NoControl) {
        this.NoControl = NoControl;
    }
    

    @Override
    public void imprimirDatos() {
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("NUMERO DE CONTROL: " + this.NoControl);
        
    }
    
}
