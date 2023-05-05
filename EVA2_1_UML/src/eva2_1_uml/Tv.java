
package eva2_1_uml;

/**
 *
 * @author pesca
 */
public class Tv {
   private int canal;
    private int volumen;
    private boolean power;
    
    public int getCanal(){
        return canal;
    }
    public void setCanal(int valor){
        canal = valor;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int valor){
        volumen = valor;
    }
    public boolean getPower(){
        return power;
    }
    public void setPower(boolean valor){
        power = valor;
    }
    public void imprimirDatos(){
        System.out.println("ESTADO DE LA TV: ");
        System.out.println("CANAL: " + canal);
        System.out.println("VOLUMEN: " + volumen);
        System.out.println("POWER: " + power);
    }
} 

