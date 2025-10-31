package uni1a;

public class Publicidad extends ContenidoAudiovisual{
	//nueva clase Publicidad para añadir a contenido audiovisual
    private String anunciante;
    private String productora;
    //constructor de la clase
    public Publicidad(String titulo, int duracionEnMinutos, String genero, String anunciante, String productora) {
        super(titulo, duracionEnMinutos, genero);
        this.anunciante = anunciante;
        this.productora = productora;
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
    //sobreescritura del metodo para añadir los nuevos atributos
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Publicidad:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Anunciante: " + this.anunciante);
        System.out.println("Productora: " + this.productora);
        System.out.println();
    }
}
