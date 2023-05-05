
package eva2_1_uml;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class Persona {
    private int ID;
    private String nombre;
    private int edad;
    
    public int getID(){
        return ID;
    }
    public void setID(int valor){
        ID = valor;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
    }
    public void imprimirDatos(){
        System.out.println("DATOS DE PERSONA: ");
        System.out.println("ID: " + ID);
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
    }
}
