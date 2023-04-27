
package eva2_25_has_a_direccion;


public class EVA2_25_HAS_A_DIRECCION {


    public static void main(String[] args) {
        // TODO code application logic here
        
        Personas pers = new Personas();
        pers.setNombre("Luis");
        pers.setApellido("Reyes");
        pers.setEdad(28);
        
        // Para asignar la direccion debemos de crear un objeto
     Direccion direc  = new Direccion();
        direc.setCalle("Industrias");
        direc.setNumero(11101);
        direc.setColonia("Complejo Industrial Chihuahua");
        direc.setCp("31135");
        direc.setCiudad("Chihuahua");
        direc.setEstado("Chihuahua");
        pers.setDireccion(direc);
        pers.imprimirDatos();
        
     
    }
    
}

class Direccion{
    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion() {
        this.calle = "-------";
        this.numero = 0;
        this.colonia = "-------";
        this.cp = "-------";
        this.ciudad = "-------";
        this.estado = "-------";
    }

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("DIRECCION:");
        System.out.println(calle + "#" + numero + "," + 
        colonia + "\nC.P" + cp + ","+ ciudad + "," + estado);
    }
}
class Personas {
   private String nombre;
   private String apellido;
   private int edad;
   private Direccion direccion; // Persona Has (tiene una) dirección

    public Personas() {
        this.nombre = "-------";
        this.apellido = "-------";
        this.edad = 0;
        this.direccion = null; // NO EXISTE EL OBJETO DIRECCIÓN
    }

    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
   
    public void imprimirDatos(){
        System.out.println("\nPERSONA:");
        System.out.println(nombre + " " + apellido + " " + edad + "años.");
        direccion.imprimirDatos();
        
        if (direccion == null)
            System.out.println("SIN DIRECCION");
        else
            direccion.imprimirDatos();
    }
   
}
class Sucursal{
    private String nombreSucursal;
    private Direccion direccion;
}