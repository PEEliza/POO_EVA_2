
package eva2_4_formato_apa;


public class Sitio_Web  extends Documento{
   private String nomSitioWeb;
   private String URL;

    public Sitio_Web() {
    }

    public Sitio_Web(String nomSitioWeb, String URL) {
        this.nomSitioWeb = nomSitioWeb;
        this.URL = URL;
    }

    public String getNomSitioWeb() {
        return nomSitioWeb;
    }

    public String getURL() {
        return URL;
    }

    public void setNomSitioWeb(String nomSitioWeb) {
        this.nomSitioWeb = nomSitioWeb;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
   
   
}
