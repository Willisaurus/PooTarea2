package pruebaAudioVisualModelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PeliculaTest {

    @Test
    void testCrearPelicula() {
        Pelicula p = new Pelicula("Titanic", 195, "Romance", "Fox");

        // En JUnit 5, el mensaje va al FINAL
        assertEquals("Titanic", p.getTitulo(), "El título no coincide");
        assertEquals(195, p.getDuracionEnMinutos(), "La duración no coincide");
        assertEquals("Fox", p.getEstudio(), "El estudio no coincide");
    }

    @Test
    void testAgregarActor() {
        Pelicula p = new Pelicula("Avatar", 120, "Accion", "Fox");

        assertNotNull(p.getActores(), "La lista no debe ser nula");
        assertTrue(p.getActores().isEmpty(), "La lista debe iniciar vacía");
        p.agregarActor(new Actor("Sam", "USA"));
        assertEquals(1, p.getActores().size(), "Debería haber 1 actor");
        assertEquals("Sam", p.getActores().get(0).getNombreActor(), "El nombre del actor es incorrecto");
    }
}