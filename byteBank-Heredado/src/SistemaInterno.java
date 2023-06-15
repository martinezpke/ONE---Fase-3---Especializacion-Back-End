
public class SistemaInterno {
	
	private String clave = "12345";
	
	public boolean autenticar(Gerente gerente) {
		boolean pIs = gerente.autenticar(this.clave);
		if(pIs) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
