package q2;

// Interface Observer: define o contrato para os observadores (meios de pagamento)
public interface Observador {
    void update(Pagamento pagamento);
}
