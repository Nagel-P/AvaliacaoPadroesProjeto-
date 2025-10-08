package q4;

// Classe abstrata base para os decoradores
// Armazena uma referência para outro objeto do tipo Relatorio
public abstract class Decorator implements Relatorio {
    protected Relatorio relatorio;

    public Decorator(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    @Override
    public void gerar() {
        relatorio.gerar();
    }
}
