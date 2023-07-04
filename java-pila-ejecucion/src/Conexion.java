
public class Conexion implements AutoCloseable {
	
	public Conexion() {
	    System.out.println("Abriendo conexion");
	    
	}

	public void leerDatos() {
	    System.out.println("Recibiendo datos");
	    // Esta execion es comun cuando se refiere que hay problema de conexion con otro servicio 
	    throw new IllegalStateException();
	 }

	public void cerrar() {
	    System.out.println("Cerrando conexion");
	}

	@Override
	public void close() throws Exception {
		cerrar();
		
	}

		   
}
