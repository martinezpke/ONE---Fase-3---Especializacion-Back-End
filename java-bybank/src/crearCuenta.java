
public class crearCuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
		Cuenta kevin = new Cuenta();
		Cuenta maria = new Cuenta();
		primeraCuenta.depositar(1000);
		kevin.depositar(1000);
		maria.depositar(1000);
		
		System.out.println(primeraCuenta.saldo); 
		
		double valor = 900;
		if (primeraCuenta.retirar(valor)) {
			System.out.println("Si puedes retirar");
			System.out.println("Has retirado "+valor);
			System.out.println("\nsu nuevo saldo total: "+primeraCuenta.saldo);
		}else {
			System.out.println("No puedes retirar, saldo insuficinete");
		}
		
		if (kevin.trasferir(valor, maria)) {
			System.out.println("\n\nSi puedes trasferir");
			System.out.println("Has trasferido "+valor);
			System.out.println("\ntu saldo saldo total: "+kevin.saldo);
			System.out.println("\ntu saldo saldo total: "+maria.saldo);
		}else {
			System.out.println("No puedes retirar, saldo insuficinete");
		}
		
		
	}
}
