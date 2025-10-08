package q2;

// Observer concreto para processar pagamento via PIX
public class Pix implements Observador {
    @Override
    public void update(Pagamento pagamento) {
        if (pagamento.getMetodo().equalsIgnoreCase("pix")) {
            System.out.println("🔔 Iniciando transação via PIX...");
            System.out.println("Valor: R$ " + pagamento.getValor());
            System.out.println("Transação concluída instantaneamente!\n");
        }
    }
}