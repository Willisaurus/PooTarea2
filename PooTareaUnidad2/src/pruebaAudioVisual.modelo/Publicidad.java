package pruebaAudioVisual.modelo;
import java.util.ArrayList;

public class Publicidad extends ContenidoAudiovisual{
    //nueva clase Publicidad para añadir a contenido audiovisual
    private String anunciante;
    private String productora;
    /*
     Creamos una lista de actores para cada nuevo objeto publicidad,
     asi marcamos una nueva relacion de agregacion entre la clase
     existente actores y la nueva clase publicidad.
     */
    private ArrayList<Actor> actores;
    //constructor de la clase
    public Publicidad(String titulo, int duracionEnMinutos, String genero, String anunciante, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.anunciante = anunciante;
        this.productora = productora;
        //retorno de actores
        this.actores = new ArrayList<>();
    }
    //getters y setters
    public String getAnunciante() {
        return anunciante;
    }

    public void setAnunciante(String anuncainte) {
        this.anunciante = anuncainte;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }
    //metodo de la clase Pelicula reutilizado para añadir actores a la publicidad
    public Publicidad agregarActor(Actor actor) {
        this.actores.add(actor);
        return this;
    }
    //sobreescritura del metodo para añadir los nuevos atributos
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Publicidad:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anunciante: " + this.anunciante);
        System.out.println("Productor@: " + this.productora);
        System.out.println("Actores:");
        //bucle para agregar actores que se repite de la clase Pelicula
        for (Actor actor : this.actores) {
            // Concatenamos el nombre Y la nacionalidad del actor
            System.out.println("- " + actor.getNombreActor() + " (" + actor.getNacionalidad() + ")");
        }
        System.out.println();
    }
}