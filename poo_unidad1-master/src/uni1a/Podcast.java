package uni1a;

import java.util.ArrayList;

public class Podcast extends ContenidoAudiovisual{
	//nueva clase Podcast relacioanda con contenido audiovisual
    private int totalCapitulos;
    private String host;
    private ArrayList<Invitado> invitados;

    //setters y getters de la clase
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
    //constructor de la nueva clase
    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, int totalCapitulos ) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.totalCapitulos = totalCapitulos;
        this.invitados = new ArrayList<>();
    }
    //metodo para agregar invitados a la lista de invitados
    public Podcast agregarInvitado(Invitado invitado) {
        this.invitados.add(invitado);
        return this;
    }

    //sobreescritura del metodo para añadir los atributos host y totalcapitulos
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host: " + this.host);
        System.out.println("Total de Capítulos: " + this.totalCapitulos);
        for (Invitado invitados : this.invitados) {
            // Modificacion del metodo para concatenar al invitado y su nacionalidad
            System.out.println("- " + invitados.getNombreInvitado() + " (" + invitados.getNacionalidadInvitado() + ")");
        }
        System.out.println();
        System.out.println();
    }

}
