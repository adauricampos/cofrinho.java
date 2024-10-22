import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Classe abstrata que representa uma moeda.
 */
public abstract class Moeda {
    protected BigDecimal valor;

    public Moeda(double valor) {
        this.valor = BigDecimal.valueOf(valor).setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public abstract String getTipo();
}