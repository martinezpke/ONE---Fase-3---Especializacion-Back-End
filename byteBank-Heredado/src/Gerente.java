
public class Gerente extends Funcionario {
	
	 private int contrasena;

	    public void setContraseña(int contrasena) {
	        this.contrasena = contrasena;
	    }

	    public boolean autenticar(int contrasena) {
	        if (this.contrasena == contrasena) {
	            return true;
	        } else {
	            return false;
	        }
	    }
}
