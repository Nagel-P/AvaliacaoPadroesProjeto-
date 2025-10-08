package q3;

// Classe concreta que representa o Observador
public class Leitor implements Observador {
    private String nome;

    public Leitor(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeTopico, String noticia) {
        System.out.println("Olá " + nome + "! Nova notícia em " + nomeTopico + ": " + noticia);
    }

    public String getNome() {
        return nome;
    }
}