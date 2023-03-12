
package eva2_8_super;


public class EVA2_8_SUPER {

    public static void main(String[] args) {
        // TODO code application logic here
    Animal animal = new Animal("Lala",74);
      Mamifero mamifero = new Mamifero("Negro","Lili",47);  
      Canes can = new Canes ();
    
    }
    
}
 class Animal{
     private String nombre;
     private int peso;

     public Animal(){
         System.out.println("ITS ALIVE!!");
     }
      
     public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE constructor 2!!");
    }
     
     public void Respirar(){
         System.out.println("Estoy respirando");
     }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
     
     
 }

class Mamifero extends Animal{
    private String Colorpelo;


    public Mamifero(String Colorpelo, String nombre, int peso) {
        super(nombre, peso); // Llamada al constructor de la super
        this.Colorpelo = Colorpelo;
        System.out.println("Souy un mamifero Constructor 2!!");
    }
     
    public Mamifero(){
        // super --> apunta a constructores y métodos de la superclase
        // Lo primero es llamar al cosntructor de la de  superclase
        super(); // Llamada al constructor default
        System.out.println("Soy un mamifero!!");
        
    }

    public String getColorpelo() {
        return Colorpelo;
    }

    public void setColorpelo(String Colorpelo) {
        this.Colorpelo = Colorpelo;
    }
    
}

class Canes extends Mamifero{

    public Canes() {
    super();
        System.out.println("Soy un Can!!");
    }
    
    
}