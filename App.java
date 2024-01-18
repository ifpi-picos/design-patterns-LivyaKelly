// App.java
public class App {

    public static void main(String[] args) {
        // Cria a notícia (o sujeito observado)
        Noticia noticia = new Noticia("Título inicial da notícia");

        // Cria observador concreto
        ObservadorConcreto observador = new ObservadorConcreto();

        // Adiciona o observador concreto à notícia
        noticia.adicionarObservador(observador);

        // Exibe o título inicial da notícia
        System.out.println("Título inicial: " + noticia.getTitulo());

        // Altera o título da notícia
        noticia.setTitulo("Novo título da notícia");

        // Observadores serão notificados automaticamente

        // Exibe o título atualizado da notícia
        System.out.println("Título atualizado: " + noticia.getTitulo());
    }
}
