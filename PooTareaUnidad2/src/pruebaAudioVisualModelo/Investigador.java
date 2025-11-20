package pruebaAudioVisualModelo;

public class Investigador {
	
	private String nombreInvestigador;
	private int edadInvestigador;
	private String nacionalidadInvestigador;

	public Investigador(String nombreInvestigador, int edadInvestigador, String nacionalidadInvestigador) {
		super();
		this.nombreInvestigador = nombreInvestigador;
		this.edadInvestigador = edadInvestigador;
		this.nacionalidadInvestigador = nacionalidadInvestigador;
	}

	public String getNombreInvestigador() {
        return nombreInvestigador;
	}

	public void setNombreInvestigador(String nombreInvestigador) {
        this.nombreInvestigador = nombreInvestigador;
	}

	public int getEdadInvestigador() {
        return edadInvestigador;
	}

	public void setEdadInvestigador(int edadInvestigador) {
        this.edadInvestigador = edadInvestigador;
	}

	public String getNacionalidadInvestigador() {
        return nacionalidadInvestigador;
	}

	public void setNacionalidadInvestigador(String nacionalidadInvestigador) {
		this.nacionalidadInvestigador = nacionalidadInvestigador;
	}
	
}
