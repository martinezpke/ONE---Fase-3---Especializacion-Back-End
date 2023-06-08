/* Entienda cuenta 
 * 
 * saldo
 * agencia
 * numero
 * titular
 * 
 * */


class Cuenta {
	double saldo;
	int agencia;
	int numero;
	ClienteClass titular;
	 
	
	public void depositar (double saldo) {
		this.saldo += saldo;
	}
	
	public boolean retirar (double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean trasferir (double valor, Cuenta cuenta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuenta.saldo += valor;
			return true;
		}else {
			return false;
		}
		
	} 
} 
