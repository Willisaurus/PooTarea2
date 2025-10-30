package uni1a;

public class Temporada {
	
	private int numeroTemporada;
	private int cantidadCapitulos;
	
	//Se crea el constructor, los setter y getters
	
	public Temporada(int numeroTemporada, int cantidadCapitulos) {
		super();
		this.numeroTemporada = numeroTemporada;
		this.cantidadCapitulos = cantidadCapitulos;
	}

	// Getters y Setters
	public int getTemporadas() {
		return numeroTemporada;
	}

	public void setTemporadas(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	public int getCantidadCapitulos() {
		return cantidadCapitulos;
	}

	public void setCantidadCapitulos(int cantidadCapitulos) {
		this.cantidadCapitulos = cantidadCapitulos;
	}
}
