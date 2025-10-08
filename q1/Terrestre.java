// Implementação concreta do Observer para transporte terrestre
public class Terrestre implements Observador {

    @Override
    public void update(Transporte transporte) {
        double tarifa = transporte.getDistancia() * 0.75; // Exemplo: R$ 0,75 por km
        System.out.println("Tarifa terrestre: R$ " + tarifa);
    }
}
