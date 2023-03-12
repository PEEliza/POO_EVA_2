
package eva2_4_formato_apa;


public class Libro extends Documento{
  private String Editorial;
  private String ACorporativo;

    public Libro() {
    }

    public Libro(String Editorial, String ACorporativo) {
        this.Editorial = Editorial;
        this.ACorporativo = ACorporativo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public String getACorporativo() {
        return ACorporativo;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setACorporativo(String ACorporativo) {
        this.ACorporativo = ACorporativo;
    }

 
  
  
 

  
}
