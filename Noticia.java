// Noticia.java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Noticia {
    private String titulo;
    private List<Observador> observadores;

    public Noticia(String titulo) {
        this.titulo = titulo;
        this.observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.notificar(this);
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        notificarObservadores();
    }

    public List<Observador> getObservadores() {
        return Collections.unmodifiableList(observadores);
    }

    public void limparObservadores() {
        observadores.clear();
    }
}
