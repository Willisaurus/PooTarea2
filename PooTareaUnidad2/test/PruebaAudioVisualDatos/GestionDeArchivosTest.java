package PruebaAudioVisualDatos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;
import pruebaAudioVisualModelo.*;

public class GestionDeArchivosTest {

    private GestionDeArchivos gestor;
    private final String ARCHIVO_PRUEBA = "datos.csv";
    /*
    Usamos esta funcion para poder gratinzar un estado limpio antes de cada prueba
    y evitar que los archivos generados en una prueba afecten a las demas pruebas
     */
    @BeforeEach // Cambia de @Before a @BeforeEach
    void setUp() {
        gestor = new GestionDeArchivos();
    }
    /*
    Limpia los recursos, de este modo se borra el archivo datos.csv despues de cada prueba
    para no afectar  al funcionamiento real del programa ni de otras pruebas
     */
    @AfterEach // Cambia de @After a @AfterEach
    void tearDown() {
        File archivo = new File(ARCHIVO_PRUEBA);
        if (archivo.exists()) {
            archivo.delete();
        }
    }

    @Test
    void testGuardarYCargarDatos() {
        // 1. Preparar
        ArrayList<ContenidoAudiovisual> listaOriginal = new ArrayList<>();
        Pelicula peli = new Pelicula("Test Movie", 90, "Test", "Studio");
        peli.agregarActor(new Actor("Actor Test", "Land"));
        listaOriginal.add(peli);

        // 2. Guardar
        gestor.guardarDatos(listaOriginal);

        // 3. Cargar
        ArrayList<ContenidoAudiovisual> listaCargada = gestor.cargarDatos();

        // 4. Verificar
        assertNotNull(listaCargada, "La lista cargada no debe ser nula");
        assertEquals(1, listaCargada.size(), "Debería haber 1 elemento");

        Pelicula peliRecuperada = (Pelicula) listaCargada.get(0);
        assertEquals("Test Movie", peliRecuperada.getTitulo());
        assertEquals(1, peliRecuperada.getActores().size(), "Debería recuperar los actores");
    }
    /*
    Prueba de caso limite, prueba que el sistema no falle, sin lanzar excepciones no controladas
    si ela rchivo de datos es eliminado manuelmente.
     */
    @Test
    void testCargarArchivoNoExistente() {
        // Aseguramos que no existe
        new File(ARCHIVO_PRUEBA).delete();

        // Intentamos cargar
        ArrayList<ContenidoAudiovisual> resultado = gestor.cargarDatos();

        // Verificamos robustez
        assertNotNull(resultado, "No debe devolver null");
        assertTrue(resultado.isEmpty(), "La lista debe estar vacía");
    }
}