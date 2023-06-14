
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente(int agencia, int numero) {
		// Aqui estamos accedimos al constructor de la clase padre
		super(agencia, numero);
	}
	
	
	//indica que este metodo esta sobre escribiendo el metodo de la clase padre
	
	@Override 
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}
}
