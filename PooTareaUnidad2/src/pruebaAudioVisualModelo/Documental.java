/**
 * Class Documental
 */
package pruebaAudioVisualModelo;
import java.util.ArrayList;

public class Documental extends ContenidoAudiovisual {
	
    private String tema;
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

    public ArrayList<Investigador> getListaDeInvestigadores() {
        return this.listaDeInvestigadores;
    }

    public Documental agregarInvestigador(Investigador investigador) {
        this.listaDeInvestigadores.add(investigador);
        return this;
    }

}