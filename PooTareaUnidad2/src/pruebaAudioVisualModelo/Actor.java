package pruebaAudioVisualModelo;

public class Actor {

	private String nombreActor;
	private String nacionalidad;

    public Actor(String nombreActor, String nacionalidad) {
        super();
        this.nombreActor = nombreActor;
        this.nacionalidad = nacionalidad;
    }

	public String getNombreActor() {
        return nombreActor;
	}
	
	public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
	}
	
	public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
	}

    public String getNacionalidad() {
        return nacionalidad;
    }
	
}
