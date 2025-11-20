package pruebaAudioVisualModelo;
import java.util.ArrayList;

public class Publicidad extends ContenidoAudiovisual{

    private String anunciante;
    private String productora;
    private ArrayList<Actor> actores;

    public Publicidad(String titulo, int duracionEnMinutos, String genero, String anunciante, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.anunciante = anunciante;
        this.productora = productora;
        //retorno de actores
        this.actores = new ArrayList<>();
    }

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

    public Publicidad agregarActor(Actor actor) {
        this.actores.add(actor);
        return this;
    }

    public ArrayList<Actor> getActores() {
        return this.actores;
    }

}