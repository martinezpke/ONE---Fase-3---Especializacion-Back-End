
public class TestConexion {
	public static void main(String[] args) throws Exception {
		try (Conexion con = new Conexion()) {
			con.leerDatos();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		Conexion con = null;
		try {
			con = new Conexion();
			con.leerDatos();
		} 
		
		catch (IllegalStateException e) {
			e.printStackTrace();
		} 
		
		finally {
			if (con != null) {
				con.cerrar();
			}
			
		}
		*/
	}
}
