package q4;

// Decorador concreto que adiciona exportação em PDF ao relatório
public class ExportacaoPDF extends Decorator {

    public ExportacaoPDF(Relatorio relatorio) {
        super(relatorio);
    }

    @Override
    public void gerar() {
        super.gerar();
        exportarPDF();
    }

    private void exportarPDF() {
        System.out.println("Exportando relatório em formato PDF.");
    }
}
