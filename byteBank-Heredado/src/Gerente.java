
public class Gerente extends Funcionario implements Autenticar {
	
	private String contrasena;
	    
	    public double getBonificacion() {
	    	// super -> hace referencia a la clase padre
	    	return super.getSalario() + this.getSalario()* 0.05;
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
