package q3;

// Interface Subject
public interface Sujeito {
    void adicionarObservador(Observador observador);

    void removerObservador(Observador observador);

    void notificarObservadores(String noticia);
}
