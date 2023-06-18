
public class Administrador extends Funcionario implements Autenticar {
	
	private String contrasena;
	
	@Override
	public double getBonificacion() {
		return this.getBonificacion();
	}

	@Override
	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
		
	}

	@Override
	public boolean autenticar(String contrasena) {
		if (this.contrasena == contrasena) {
            return true;
        } else {
            return false;
        }
	}
	
	
}
