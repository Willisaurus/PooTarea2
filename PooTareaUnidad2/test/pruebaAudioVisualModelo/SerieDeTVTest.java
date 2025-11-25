package pruebaAudioVisualModelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SerieDeTVTest {

    @Test
    void testCrearSerie() {
        SerieDeTV serie = new SerieDeTV("Dark", 60, "Sci-Fi", 3);
        assertEquals("Dark", serie.getTitulo());
        assertEquals(3, serie.getTemporadas());
    }

    @Test
    void testAgregarTemporada() {
        SerieDeTV serie = new SerieDeTV("Friends", 22, "Comedia", 10);

        serie.agregarTemporada(new Temporada(1, 24));

        assertEquals(1, serie.getListaDeTemporadas().size(), "Debería tener 1 temporada en la lista");
        assertEquals(24, serie.getListaDeTemporadas().get(0).getCantidadCapitulos(), "Capítulos incorrectos");
    }

    @Test
    void testCasosLimite() {
        SerieDeTV serie = new SerieDeTV("Vacia", 0, "", 0);
        assertEquals(0, serie.getListaDeTemporadas().size(), "Una serie nueva no debe tener temporadas guardadas");
    }
}