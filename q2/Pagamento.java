package q2;

import java.util.ArrayList;
import java.util.List;

// Classe Subject (observável) que representa uma operação de pagamento
public class Pagamento {
    private List<Observador> observadores = new ArrayList<>();
    private String metodo; // Ex: "Cartão", "Boleto", "PIX"
    private double valor; // Valor da transação

    public void addObserver(Observador o) {
        observadores.add(o);
    }

    public void removeObserver(Observador o) {
        observadores.remove(o);
    }

    public void notifyObservers() {
        for (Observador o : observadores) {
            o.update(this);
        }
    }

    public void setPagamento(String metodo, double valor) {
        this.metodo = metodo;
        this.valor = valor;
        System.out.println("Novo pagamento configurado: " + metodo + " - R$" + valor);
        notifyObservers(); // notifica todos os meios de pagamento
    }

    public String getMetodo() {
        return metodo;
    }

    public double getValor() {
        return valor;
    }
}
