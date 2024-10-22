/**
 * Classe que representa uma moeda do tipo Dólar.
 */
public class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String getTipo() {
        return "Dólar";
    }
}