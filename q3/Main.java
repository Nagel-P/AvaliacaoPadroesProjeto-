package q3;

public class Main {
    public static void main(String[] args) {
        // Criação dos tópicos
        Topico politica = new Topico("Política");
        Topico esportes = new Topico("Esportes");
        Topico tecnologia = new Topico("Tecnologia");

        // Criação dos leitores
        Leitor pedro = new Leitor("Pedro");
        Leitor ana = new Leitor("Ana");
        Leitor lucas = new Leitor("Lucas");

        // Inscrições
        politica.adicionarObservador(pedro);
        politica.adicionarObservador(ana);

        esportes.adicionarObservador(lucas);
        esportes.adicionarObservador(pedro);

        tecnologia.adicionarObservador(ana);

        // Publicações
        politica.publicarNoticia("Novo projeto de lei aprovado no congresso.");
        esportes.publicarNoticia("Time X vence campeonato nacional!");
        tecnologia.publicarNoticia("Novo smartphone é lançado com IA avançada.");
    }
}
