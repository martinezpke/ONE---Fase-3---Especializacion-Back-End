
public class equipo {
	private String name;
	private String pais;
	private Entrenador entrenador;
	private double dinero;
	
	
	public equipo(String name, String pais, Entrenador entreandor) {
		this.name = name;
		this.pais = pais;
		this.entrenador = entreandor;
		solicitud(entrenador);
	}
	
	
	private void solicitud(Entrenador entreandor) {
		entrenador.setEquipo(this.name);
	}
	
	public Entrenador getEntrenador() {
		return entrenador;
	}
	
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
		solicitud(entrenador);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}


	
}
