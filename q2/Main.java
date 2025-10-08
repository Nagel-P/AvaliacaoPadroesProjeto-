package q2;

// Classe principal para testar o sistema
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento();

        // Adiciona os meios de pagamento (observadores)
        pagamento.addObserver(new CartaoCredito());
        pagamento.addObserver(new Boleto());
        pagamento.addObserver(new Pix());

        // Simula pagamentos de diferentes tipos
        System.out.println("== Pagamento com Cartão ==");
        pagamento.setPagamento("Cartão", 250.0);

        System.out.println("== Pagamento com Boleto ==");
        pagamento.setPagamento("Boleto", 480.0);

        System.out.println("== Pagamento com PIX ==");
        pagamento.setPagamento("PIX", 120.0);
    }
}
