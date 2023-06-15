
public class Gerente extends Funcionario {
	
	 private String contrasena;

	    public void setContraseña(String contrasena) {
	        this.contrasena = contrasena;
	    }

	    public boolean autenticar(String contrasena) {
	        if (this.contrasena == contrasena) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    public double getBonificacion() {
	    	// super -> hace referencia a la clase padre
	    	return super.getSalario() + this.getSalario()* 0.05;
	    }
}
