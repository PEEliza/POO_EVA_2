/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1_uml;

/**
 *
 * @author pesca
 */
public class Vehiculo {
      private String marca;
    private String modelo;
    private int anio;
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int valor){
        anio = valor;
    }
    public void imprimirDatos(){
        System.out.println("DATOS DEL VEHICULO ");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("AÑO: " + anio);
    }
}

