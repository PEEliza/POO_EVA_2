
package eva2_4_formato_apa;


public class Articulo extends Documento {
    private String TitPeriodico;
    private int Paginas;

    public Articulo() {
    }

    public Articulo(String TitPeriodico, int Paginas) {
        this.TitPeriodico = TitPeriodico;
        this.Paginas = Paginas;
    }

    public String getTitPeriodico() {
        return TitPeriodico;
    }

    public int getPaginas() {
        return Paginas;
    }

    public void setTitPeriodico(String TitPeriodico) {
        this.TitPeriodico = TitPeriodico;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }
    
    
}
