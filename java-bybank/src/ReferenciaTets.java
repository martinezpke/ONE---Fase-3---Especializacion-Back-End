
public class ReferenciaTets {
	public static void main(String[] args) {
		
		ClienteClass diego = new ClienteClass();
		diego.edad = 20;
		diego.name = "Diego";
		diego.tel = "000 000 0000";
		diego.CC = "1234567";
		diego.genero = "Hombre";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia = 1;
		cuentaDeDiego.titular = diego;
		
		System.out.println(cuentaDeDiego.titular);
		
	}
}
