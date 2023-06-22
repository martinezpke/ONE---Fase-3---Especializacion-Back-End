
public class testCuentaExecepcion {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.depositar();
		} catch (MiExcepcion e) {
			e.printStackTrace();
		}
	}
}
