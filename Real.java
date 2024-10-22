/**
 * Classe que representa uma moeda do tipo Real.
 */
public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String getTipo() {
        return "Real";
    }
}