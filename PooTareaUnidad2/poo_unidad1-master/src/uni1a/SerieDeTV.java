/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.ArrayList; // No olvidar el import

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    
    private int Temporadas;
    
    private ArrayList<Temporada> listaDeTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int totalTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.Temporadas = totalTemporadas;
        
        
        this.listaDeTemporadas = new ArrayList<>(); 
    }

    
    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int totalTemporadas) {
        this.Temporadas = totalTemporadas;
    }
    
    //metodo para encadenar al imprimir
    public SerieDeTV agregarTemporada(Temporada temporada) {
        this.listaDeTemporadas.add(temporada);
        return this;
    }
    
    public ArrayList<Temporada> getListaDeTemporadas() {
        return this.listaDeTemporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas Totales: " + this.Temporadas);
        System.out.println("Detalle de Temporadas:");
        for (Temporada temp : this.listaDeTemporadas) {
            System.out.println("- Temporada " + temp.getTemporadas() + 
                               " (" + temp.getCantidadCapitulos() + " capítulos)");
        }
        System.out.println();
    }
}
