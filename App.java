// Sistema de Atualização de Notícias em Aplicações de Mídia

public class App {

    public static void main(String[] args) {
        // Cria o sujeito
        Sujeito sujeito = new Sujeito();

        // Cria observadores
        Observador observador1 = new Observador() {
            @Override
            public void notificar(Noticia noticia) {
                System.out.println("Observador 1 notificado: " + noticia.getTitulo());
            }
        };

        Observador observador2 = new Observador() {
            @Override
            public void notificar(Noticia noticia) {
                System.out.println("Observador 2 notificado: " + noticia.getTitulo());
            }
        };

        // Adiciona os observadores ao sujeito
        sujeito.adicionarObservador(observador1);
        sujeito.adicionarObservador(observador2);

        // Cria uma nova notícia
        Noticia noticia = new Noticia("Título da notícia", "Conteúdo da notícia", "Categoria da notícia");

        // Notifica os observadores
        sujeito.notificarObservadores(noticia);
    }
}