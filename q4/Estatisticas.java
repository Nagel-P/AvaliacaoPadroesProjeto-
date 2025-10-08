package q4;

// Decorador concreto que adiciona estatísticas ao relatório
public class Estatisticas extends Decorator {

    public Estatisticas(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        adicionarEstatisticas();
    }

    private void adicionarEstatisticas() {
        System.out.println("Adicionando estatísticas de faturamento e vendas ao relatório.");
    }
}
