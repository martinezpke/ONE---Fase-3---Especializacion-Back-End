
public class crear {
	public static void main(String[] args) {
		Entrenador entrenador1 = new Entrenador("Xavi Hernandez");
		equipo equipo1 = new equipo("Barcelona", "España", entrenador1);
		
		
		System.out.println(entrenador1.getEquipo());
		System.out.println("Entreandor del equipo: "+equipo1.getEntrenador().getName());
	}
}

