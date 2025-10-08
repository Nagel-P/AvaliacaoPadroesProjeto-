package q2;

// Observer concreto para processar pagamento via Boleto Bancário
public class Boleto implements Observador {
    @Override
    public void update(Pagamento pagamento) {
        if (pagamento.getMetodo().equalsIgnoreCase("boleto")) {
            System.out.println("🔔 Gerando Boleto Bancário...");
            System.out.println("Valor: R$ " + pagamento.getValor());
            System.out.println("Boleto gerado com vencimento em 3 dias úteis.\n");
        }
    }
}