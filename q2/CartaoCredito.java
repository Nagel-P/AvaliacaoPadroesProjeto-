package q2;

// Observer concreto para processar pagamento via Cartão de Crédito
public class CartaoCredito implements Observador {
    @Override
    public void update(Pagamento pagamento) {
        if (pagamento.getMetodo().equalsIgnoreCase("cartão")) {
            System.out.println("🔔 Processando pagamento no Cartão de Crédito...");
            System.out.println("Valor: R$ " + pagamento.getValor());
            System.out.println("Transação aprovada com sucesso!\n");
        }
    }
}
