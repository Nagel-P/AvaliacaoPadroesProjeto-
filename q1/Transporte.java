import java.util.ArrayList;
import java.util.List;

// Classe Subject (observável)
// É a classe principal que mantém uma lista de observadores e notifica quando há mudanças.
public class Transporte {
    private List<Observador> observadores = new ArrayList<>();
    private double distancia; // usado para transporte terrestre
    private double peso; // usado para transporte aéreo
    private double volume; // usado para transporte marítimo

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

    // Métodos que alteram o estado e notificam os observadores
    public void setDistancia(double distancia) {
        this.distancia = distancia;
        notifyObservers();
    }

    public void setPeso(double peso) {
        this.peso = peso;
        notifyObservers();
    }

    public void setVolume(double volume) {
        this.volume = volume;
        notifyObservers();
    }

    // Getters
    public double getDistancia() {
        return distancia;
    }

    public double getPeso() {
        return peso;
    }

    public double getVolume() {
        return volume;
    }
}
