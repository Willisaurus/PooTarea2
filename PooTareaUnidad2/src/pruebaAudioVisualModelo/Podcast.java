package pruebaAudioVisualModelo;

import java.util.ArrayList;

public class Podcast extends ContenidoAudiovisual{

    private int totalCapitulos;
    private String host;
    private ArrayList<Invitado> invitados;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, int totalCapitulos ) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.totalCapitulos = totalCapitulos;
        this.invitados = new ArrayList<>();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getTotalCapitulos() {
        return totalCapitulos;
    }

    public void setTotalCapitulos(int totalCapitulos) {
        this.totalCapitulos = totalCapitulos;
    }

    public Podcast agregarInvitado(Invitado invitado) {
        this.invitados.add(invitado);
        return this;
    }

    public ArrayList<Invitado> getInvitados() {
        return this.invitados;
    }

}
