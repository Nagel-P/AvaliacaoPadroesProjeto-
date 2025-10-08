// Classe principal de teste
public class Main {
    public static void main(String[] args) {
        Transporte transporte = new Transporte();

        // Adiciona os observadores
        transporte.addObserver(new Terrestre());
        transporte.addObserver(new Aereo());
        transporte.addObserver(new Maritimo());

        // Simula mudanças no estado do transporte
        System.out.println("== Alterando distância ==");
        transporte.setDistancia(100);

        System.out.println("\n== Alterando peso ==");
        transporte.setPeso(20);

        System.out.println("\n== Alterando volume ==");
        transporte.setVolume(15);
    }
}
