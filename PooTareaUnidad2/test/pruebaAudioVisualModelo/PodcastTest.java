package pruebaAudioVisualModelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PodcastTest {

    @Test
    void testPodcastFuncionalidad() {
        Podcast pod = new Podcast("The Daily", 30, "Noticias", "Michael", 100);
        assertEquals("Michael", pod.getHost());
        assertEquals(100, pod.getTotalCapitulos());
    }

    @Test
    void testInvitados() {
        Podcast pod = new Podcast("Entrevista", 60, "Charla", "Juan", 10);

        pod.agregarInvitado(new Invitado("Elon", "USA"));
        pod.agregarInvitado(new Invitado("Mark", "USA"));

        assertEquals(2, pod.getInvitados().size());
        assertEquals("Mark", pod.getInvitados().get(1).getNombreInvitado());
    }
}