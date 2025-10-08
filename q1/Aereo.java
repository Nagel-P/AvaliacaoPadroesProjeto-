// Implementação concreta do Observer para transporte aéreo
public class Aereo implements Observador {

    @Override
    public void update(Transporte transporte) {
        double tarifa = transporte.getPeso() * 5.0; // Exemplo: R$ 5,00 por kg
        System.out.println("Tarifa aérea: R$ " + tarifa);
    }
}
