package pruebaAudioVisual.modelo;

public class Actor {
	//Nueva clase actor para definir al actor de cada pelicula y su nacionaldad
	private String nombreActor;
	private String nacionalidad;
	//getter y setter para el campo nombreActor
	public String getNombreActor() {
		return nombreActor;
	}
	
	public void setNombreActor(String nombreActor) {
		this.nombreActor = nombreActor;
	}
	//getter y setter para el campo nacionalidad
	public String getNacionalidad() {
		return nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	//constructor actor
	public Actor(String nombreActor, String nacionalidad) {
		super();
		this.nombreActor = nombreActor;
		this.nacionalidad = nacionalidad;
	}
	
}
