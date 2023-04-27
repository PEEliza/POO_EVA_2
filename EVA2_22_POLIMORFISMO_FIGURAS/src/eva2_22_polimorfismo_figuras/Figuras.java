
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author pescarcega
 */

// No se pueden instanciar las interfaces
// Son como un contrato: estoy obligado a implementar
// Solo métodos abstractos y constantes
public interface Figuras {
    public abstract double calcularArea();
    double calcularPeri();
}
