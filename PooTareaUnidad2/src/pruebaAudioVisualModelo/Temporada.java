package pruebaAudioVisualModelo;

public class Temporada {
	
	private int numeroTemporada;
	private int cantidadCapitulos;

	public Temporada(int numeroTemporada, int cantidadCapitulos) {
		super();
		this.numeroTemporada = numeroTemporada;
		this.cantidadCapitulos = cantidadCapitulos;
	}

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
