package pruebaAudioVisualControlador;

import pruebaAudioVisualModelo.ContenidoAudiovisual;
import pruebaAudiovisualVista.VistaProyecto;
import java.util.ArrayList;

public class ControladorProyecto {

    private ArrayList<ContenidoAudiovisual> repositorio;
    private VistaProyecto vista;

    public ControladorProyecto(ContenidoAudiovisual[] entradaInicial) {
        this.repositorio = new ArrayList<>();
        this.vista = new VistaProyecto();

        if (entradaInicial != null) {
            for (ContenidoAudiovisual obj : entradaInicial) {
                // Validamos para no meter 'null' si el array no estaba lleno
                if (obj != null) {
                    this.repositorio.add(obj);
                }
            }
        }
    }



    public void agregarContenido(ContenidoAudiovisual contenido) {
        repositorio.add(contenido);
    }

    public void mostrarContenidos() {
        for (ContenidoAudiovisual contenido : repositorio) {
            vista.mostrarDetalles(contenido);
        }
    }
}
