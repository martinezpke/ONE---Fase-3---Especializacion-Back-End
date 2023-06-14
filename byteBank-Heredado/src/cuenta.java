


public abstract class Cuenta {
	//protected permite proteger y permitir a la variable acceder a sus clases hijas
	protected double saldo;
	private int agencia;
	private int numero;
	private ClienteClass titular;
	 
	public Cuenta(int aganecia, int numero) {
		this.agencia = aganecia;
		this.numero = numero;
		
	}
	
	public abstract void depositar (double saldo);
	
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
			this.saca(valor);
			cuenta.saldo += valor;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ClienteClass getTitular() {
		return titular;
	}

	public void setTitular(ClienteClass titular) {
		this.titular = titular;
	}
	
	
} 