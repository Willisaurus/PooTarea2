package uni1a;

public class Podcast extends ContenidoAudiovisual{

    private int totalCapitulos;
    private String host;


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

    public Podcast(String titulo, int duracionEnMinutos, String genero, String host, int totalCapitulos ) {
        super(titulo, duracionEnMinutos, genero);
        this.host = host;
        this.totalCapitulos = totalCapitulos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host: " + this.host);
        System.out.println("Total de Capítulos: " + this.totalCapitulos);
        System.out.println();
    }

}
