/**
 * Class Documental
 */
package uni1a;
import java.util.ArrayList;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
	
    private String tema;
    //se crea la lista para los investigadores
    private ArrayList<Investigador> listaDeInvestigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        
        this.listaDeInvestigadores = new ArrayList<>(); 
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    //metodo para agregar investogadores en el array
    public Documental agregarInvestigador(Investigador investigador) {
        this.listaDeInvestigadores.add(investigador);
        return this;
    }
    //getter para obtener a los investigadore
    public ArrayList<Investigador> getListaDeInvestigadores() {
        return this.listaDeInvestigadores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Detalles investigador:");
        //bucle para la informacion de cada investigador
        for (Investigador inf : this.listaDeInvestigadores) {
            System.out.println("- Investigador: " + inf.getNombreInvestigador() + 
                               ", "+ inf.getEdadInvestigador() + " años, " + inf.getNacionalidadInvestigador());
        }
        System.out.println();
    }
}