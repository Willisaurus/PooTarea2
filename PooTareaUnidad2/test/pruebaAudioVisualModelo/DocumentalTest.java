package pruebaAudioVisualModelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DocumentalTest {

    @Test
    void testCrearDocumental() {
        Documental doc = new Documental("Cosmos", 50, "Ciencia", "Universo");
        assertEquals("Universo", doc.getTema(), "El tema no coincide");
    }

    @Test
    void testAgregarInvestigador() {
        Documental doc = new Documental("Planeta", 60, "Naturaleza", "Tierra");

        doc.agregarInvestigador(new Investigador("Carl Sagan", 60, "USA"));

        assertEquals(1, doc.getListaDeInvestigadores().size());
        assertEquals("Carl Sagan", doc.getListaDeInvestigadores().get(0).getNombreInvestigador());
    }
}