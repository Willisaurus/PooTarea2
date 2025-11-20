/**
 * Class Pelicula
 */
package pruebaAudioVisual.modelo;
import java.util.ArrayList;
// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    
    private ArrayList<Actor> actores;
    
    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    //metodo para añadir actores
    public Pelicula agregarActor(Actor actor) {
        this.actores.add(actor);
        return this;
    }
    //getter para la lista de actores
    public ArrayList<Actor> getActores() {
        return this.actores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Estudio: " + estudio);
        System.out.println("Actores:");
        //bucle para agregar actores
        for (Actor actor : this.actores) {
            // Concatenamos el nombre Y la nacionalidad del actor
            System.out.println("- " + actor.getNombreActor() + " (" + actor.getNacionalidad() + ")");
        }

        System.out.println();
    }
}