package pruebaAudiovisualVista;
import pruebaAudioVisualModelo.*;

public class VistaProyecto {
    /*
    Se uso un patron de despachador, este recibe un objeto generico verifica
    de que tipo es y delega la renderizacion de forma especifica, permitiendo
    mantener el metodo limpio de logica de impresion.
     */
    public void mostrarDetalles(ContenidoAudiovisual contenido) {

        if (contenido instanceof Pelicula) {
            mostrarPelicula((Pelicula) contenido);
        } else if (contenido instanceof SerieDeTV) {
            mostrarSerie((SerieDeTV) contenido);
        } else if (contenido instanceof Documental) {
            mostrarDocumental((Documental) contenido);
        } else if (contenido instanceof Podcast) {
            mostrarPodcast((Podcast) contenido);
        } else if (contenido instanceof Publicidad) {
            mostrarPublicidad((Publicidad) contenido);
        } else {
            System.out.println("Tipo de contenido desconocido.");
        }
    }

    private void mostrarPelicula(Pelicula pelicula) {
        System.out.println("--- PELÍCULA ---");
        System.out.println("Título: " + pelicula.getTitulo());
        System.out.println("Duración: " + pelicula.getDuracionEnMinutos() + " minutos");
        System.out.println("Género: " + pelicula.getGenero());
        System.out.println("Estudio: " + pelicula.getEstudio());
        System.out.println("Actores:");
        for (var actor : pelicula.getActores()) {
            System.out.println(" - " + actor.getNombreActor() + " (" + actor.getNacionalidad() + ")");
        }
        System.out.println("----------------");
    }
    private void mostrarSerie(SerieDeTV serie) {
        System.out.println("--- SERIE DE TV ---");
        System.out.println("Título: " + serie.getTitulo());
        System.out.println("Temporadas: " + serie.getTemporadas());
        // Lógica específica de temporadas
        for (Temporada temporada : serie.getListaDeTemporadas()) {
            System.out.println(" - Temp " + temporada.getTemporadas() + ": " + temporada.getCantidadCapitulos() + " caps");
        }
        System.out.println("----------------");
    }
    private void mostrarDocumental(Documental documental) {
        System.out.println("--- DOCUMENTAL ---");
        System.out.println("Título: " + documental.getTitulo());
        System.out.println("Tema: " + documental.getTema());
        System.out.println("Investigadores:");
        for (var investigador : documental.getListaDeInvestigadores()) {
            System.out.println(" - " + investigador.getNombreInvestigador() + " (" + investigador.getNacionalidadInvestigador() + ")");
        }
        System.out.println("----------------");
    }

    private void mostrarPodcast(Podcast podcast) {
        System.out.println("--- PODCAST ---");
        System.out.println("Título: " + podcast.getTitulo());
        System.out.println("Host: " + podcast.getHost());
        System.out.println("Episodios: " + podcast.getTotalCapitulos());
        for (Invitado invitado : podcast.getInvitados()) {
            System.out.println(" - " + invitado.getNombreInvitado() + " (" + invitado.getNacionalidadInvitado() + ")");
        }
        System.out.println("----------------");
    }
    private void mostrarPublicidad(Publicidad publicidad) {
        System.out.println("--- PUBLICIDAD ---");
        System.out.println("Título: " + publicidad.getTitulo());
        System.out.println("Anunciante: " + publicidad.getAnunciante());
        System.out.println("Productora: " + publicidad.getProductora());
        System.out.println("Actores:");
        for (Actor actor : publicidad.getActores()) {
            System.out.println(" - " + actor.getNombreActor() + " (" + actor.getNacionalidad() + ")");
        }
        System.out.println("----------------");
    }
}
