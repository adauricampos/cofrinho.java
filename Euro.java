/**
 * Classe que representa uma moeda do tipo Euro.
 */
public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String getTipo() {
        return "Euro";
    }
}