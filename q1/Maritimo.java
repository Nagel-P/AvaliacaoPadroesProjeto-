// Implementação concreta do Observer para transporte marítimo
public class Maritimo implements Observador {

    @Override
    public void update(Transporte transporte) {
        double tarifa = transporte.getVolume() * 2.0; // Exemplo: R$ 2,00 por m³
        System.out.println("Tarifa marítima: R$ " + tarifa);
    }
}
