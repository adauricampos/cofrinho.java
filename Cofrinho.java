import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/// Classe que representa um cofre para armazenar moedas.
class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        moedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    public void removerMoeda(Moeda moeda) {
        moedas.remove(moeda);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()) {
            System.out.println("O cofre está vazio.");
        } else {
            for (Moeda moeda : moedas) {
                System.out.println(moeda.getTipo() + ": R$ " + moeda.getValor());
            }
        }
    }

    public BigDecimal calcularTotalEmReais() {
        BigDecimal total = BigDecimal.ZERO;
        for (Moeda moeda : moedas) {
            if (moeda instanceof Dolar) {
                total = total.add(moeda.getValor().multiply(BigDecimal.valueOf(5.25))); // Exemplo: 1 Dólar = 5.25 Reais
            } else if (moeda instanceof Euro) {
                total = total.add(moeda.getValor().multiply(BigDecimal.valueOf(6.00))); // Exemplo: 1 Euro = 6.00 Reais
            } else {
                total = total.add(moeda.getValor());
            }
        }
        return total.setScale(2, RoundingMode.HALF_UP);
    }
}