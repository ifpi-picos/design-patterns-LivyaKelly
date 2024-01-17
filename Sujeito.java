import java.util.ArrayList;
import java.util.List;

public class Sujeito {

    private List<Observador> observadores;

    public Sujeito() {
        observadores = new ArrayList<>();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Noticia noticia) {
        for (Observador observador : observadores) {
            observador.notificar(noticia);
        }
    }
}