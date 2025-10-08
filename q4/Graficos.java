package q4;

// Decorador concreto que adiciona gráficos ao relatório
public class Graficos extends Decorator {

    public Graficos(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        adicionarGraficos();
    }

    private void adicionarGraficos() {
        System.out.println("Adicionando gráficos de desempenho ao relatório.");
    }
}
