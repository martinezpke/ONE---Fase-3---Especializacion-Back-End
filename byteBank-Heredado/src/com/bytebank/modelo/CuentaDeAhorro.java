package com.bytebank.modelo;

public class CuentaDeAhorro extends Cuenta{

	public CuentaDeAhorro(int aganecia, int numero) {
		super(aganecia, numero);
	}

	@Override
	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	
	

}