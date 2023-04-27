
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author pescarcega
 */
public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto = new Automovil ("Camaro", 0, "Zl1", 0);
        cambiarVelocidad(auto, 80);
        Bicicleta bici = new Bicicleta ("Montaña", "XX", "Harley Dayvson", 0);
        cambiarVelocidad (bici, 20);
        
    }
    public static void cambiarVelocidad(DatosVehiculo vehi, int vel){
      vehi.acelerar(vel);
      vehi.tablero();
    }
}

interface DatosVehiculo{
    public abstract void acelerar (int cambio);
    void tablero();
}

class Vehiculo{
    private String marca = "-----";
    protected int velocidad = 0;
 
    public Vehiculo() {
    }

    public Vehiculo(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }  
}

class Automovil extends Vehiculo implements DatosVehiculo{
    private String modelo;
    private int año;

    public Automovil() {
    }

    public Automovil(String modelo, int año, String marca, int velocidad) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    } 

    @Override
    public void acelerar(int cambio) {
      int cambioVel = velocidad + cambio;
        if(cambioVel >= 0)// Aceptar solo velocidades positivas
        velocidad += cambioVel; // velocidad = velocidad + cambio; <-- ACUMULADOR  
        
    }

    @Override
    public void tablero() {
        System.out.println("VELOCIDAD DEL AUTOMOVIL: " + getVelocidad());
        
    }
}

class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo; // montaña, psita, etc.
    private String rodada; // tipo de llanta

    public Bicicleta() {
    }

    public Bicicleta(String tipo, String rodada, String marca, int velocidad) {
        super(marca, velocidad);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    @Override
    public void acelerar(int cambio) {
      int cambioVel = velocidad + cambio;
        if(cambioVel >= 0)// Aceptar solo velocidades positivas
        velocidad += cambioVel; // velocidad = velocidad + cambio; <-- ACUMULADOR  
    }

    @Override
    public void tablero() {
       System.out.println("VELOCIDAD DE LA BICILETA: " + getVelocidad());
 
    }
    
    
}