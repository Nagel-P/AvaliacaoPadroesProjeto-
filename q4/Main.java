package q4;

public class Main {
    public static void main(String[] args) {

        // Relatório básico
        Relatorio basico = new Basico();
        System.out.println("---- Relatório Básico ----");
        basico.gerar();

        // Relatório com estatísticas
        Relatorio estatisticas = new Estatisticas(basico);
        System.out.println("\n---- Relatório com Estatísticas ----");
        estatisticas.gerar();

        // Relatório com gráficos e estatísticas
        Relatorio completo = new Graficos(estatisticas);
        System.out.println("\n---- Relatório com Estatísticas e Gráficos ----");
        completo.gerar();

        // Relatório completo com exportação em PDF
        Relatorio pdf = new ExportacaoPDF(completo);
        System.out.println("\n---- Relatório Completo com Exportação PDF ----");
        pdf.gerar();
    }
}
