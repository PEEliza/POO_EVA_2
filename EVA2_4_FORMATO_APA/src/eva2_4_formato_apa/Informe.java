
package eva2_4_formato_apa;


public class Informe extends Documento {
    private String AutorCorporativo;
    private String Editorial;

    public Informe() {
    }

    public Informe(String AutorCorporativo, String Editorial) {
        this.AutorCorporativo = AutorCorporativo;
        this.Editorial = Editorial;
    }

    public String getAutorCorporativo() {
        return AutorCorporativo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setAutorCorporativo(String AutorCorporativo) {
        this.AutorCorporativo = AutorCorporativo;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }
    
    
}
