/**
 * Class SerieDeTV
 */
package pruebaAudioVisualModelo;
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

    public ArrayList<Temporada> getListaDeTemporadas() {
        return this.listaDeTemporadas;
    }

    public SerieDeTV agregarTemporada(Temporada temporada) {
        this.listaDeTemporadas.add(temporada);
        return this;
    }

}
