package q4;

// Classe concreta que representa o relatório básico
// Contém apenas a lista de pedidos
public class Basico implements Relatorio {
    @Override
    public void gerar() {
        System.out.println("Gerando relatório básico: Lista de pedidos.");
    }
}
