public class ObservadorConcreto implements Observador {
    @Override
    public void notificar(Noticia noticia) {
        System.out.println("Observador notificado: " + noticia.getTitulo());
    }
}
