package pruebaAudioVisualModelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicidadTest {

    @Test
    void testDatosPublicidad() {
        Publicidad pub = new Publicidad("Spot TV", 1, "Comercial", "Coca-Cola", "Agencia X");
        assertEquals("Coca-Cola", pub.getAnunciante());
    }

    @Test
    void testActoresPublicidad() {
        Publicidad pub = new Publicidad("Perfume", 1, "Lujo", "Dior", "TV");

        assertNotNull(pub.getActores());
        pub.agregarActor(new Actor("Johnny Depp", "USA"));

        assertEquals(1, pub.getActores().size());
    }
}