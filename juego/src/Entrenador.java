
public class Entrenador {
	private String name;
	private String equipo;
	
	public Entrenador(String name) {
		this.name = name;
		this.equipo = "";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
}
