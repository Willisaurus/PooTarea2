package pruebaAudioVisualControlador;

import PruebaAudioVisualDatos.GestionDeArchivos;
import pruebaAudioVisualModelo.ContenidoAudiovisual;
import pruebaAudiovisualVista.VistaProyecto;
import java.util.ArrayList;

public class ControladorProyecto {

    private ArrayList<ContenidoAudiovisual> repositorio;
    private VistaProyecto vista;
    private GestionDeArchivos gestorDeArchivos;

    public ControladorProyecto(ContenidoAudiovisual[] entradaInicial) {
        this.repositorio = new ArrayList<>();
        this.vista = new VistaProyecto();
        this.gestorDeArchivos = new GestionDeArchivos();
        //Intentamos cargar los datos desde el archivo CSV
        this.repositorio = gestorDeArchivos.cargarDatos();
        /*
        Si el archivo anterior no cuenta con los datos necesarios, se va a proceder
        a cargar los datos que se encuentran dentro del main. Este actuaria como
        una especie de pequena base de datos que mantiene nuestros valores default
        para inicializar.
         */
        if (this.repositorio.isEmpty() && entradaInicial != null)
        {
            System.out.println("Cargando datos iniciales por defecto...");
            for (ContenidoAudiovisual entrada : entradaInicial)
            {
                if (entrada != null)
                {
                    this.repositorio.add(entrada);
                }
            }
        }
        else
        {
            System.out.println("Datos cargados desde el archivo CSV exitosamente.");
            System.out.println("Print de prueba");
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

    public void guardarDatosEnArchivo() {
        gestorDeArchivos.guardarDatos(this.repositorio);
    }

}
