
package eva2_4_formato_apa;

public class Documento {
  private String autor;  
  private int año;  
  private String mes;  
  private String dia;  
  private String ciudad;

    public Documento() {
    }

    public Documento(String autor, int año, String mes, String dia, String ciudad) {
        this.autor = autor;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.ciudad = ciudad;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public String getMes() {
        return mes;
    }

    public String getDia() {
        return dia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

  
}
