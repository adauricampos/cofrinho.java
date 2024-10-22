import java.util.Scanner;

/**
 * Classe principal para executar o sistema de cofre de moedas.
 */
public class Principal {
    public static void main(String[] args) {
        Cofrinho cofre = new Cofrinho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarMoeda(cofre, scanner);
                    break;
                case 2:
                    // Implementar lógica de remoção se necessário
                    System.out.println("Remoção de moeda específica não implementada.");
                    break;
                case 3:
                    cofre.listarMoedas();
                    break;
                case 4:
                    System.out.println("Total em Reais: R$ " + cofre.calcularTotalEmReais());
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1. Adicionar moeda");
        System.out.println("2. Remover moeda");
        System.out.println("3. Listar moedas");
        System.out.println("4. Calcular total em Reais");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarMoeda(Cofrinho cofre, Scanner scanner) {
        System.out.print("Informe o valor da moeda em centavos: ");
        int centavos = scanner.nextInt();
        double valorEmReais = centavos / 100.0;

        System.out.print("Informe o tipo da moeda (Dolar/Euro/Real): ");
        String tipo = scanner.next();

        Moeda moeda;
        switch (tipo.toLowerCase()) {
            case "dolar":
                moeda = new Dolar(valorEmReais);
                break;
            case "euro":
                moeda = new Euro(valorEmReais);
                break;
            case "real":
                moeda = new Real(valorEmReais);
                break;
            default:
                System.out.println("Tipo de moeda inválido. Moeda não adicionada.");
                return;
        }
        cofre.adicionarMoeda(moeda);
        System.out.println("Moeda adicionada com sucesso!");
    }
}