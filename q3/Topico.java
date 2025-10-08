package q3;

import java.util.ArrayList;
import java.util.List;

// Classe concreta que representa um Tópico de notícias (Subject concreto)
public class Topico implements Sujeito {
    private String nome;
    private List<Observador> leitores; // lista de inscritos

    public Topico(String nome) {
        this.nome = nome;
        this.leitores = new ArrayList<>();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        leitores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        leitores.remove(observador);
    }

    @Override
    public void notificarObservadores(String noticia) {
        for (Observador leitor : leitores) {
            leitor.atualizar(nome, noticia);
        }
    }

    // Publicar nova notícia neste tópico
    public void publicarNoticia(String noticia) {
        System.out.println("\nNova notícia publicada em [" + nome + "]: " + noticia);
        notificarObservadores(noticia);
    }

    public String getNome() {
        return nome;
    }
}
