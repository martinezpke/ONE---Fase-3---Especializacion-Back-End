package com.bytebank.test;

public class testCuenta {
	public static void main(String[] args) {
		// sobre escritura de metodos
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaDeAhorro ca = new CuentaDeAhorro(2, 3);
		
		cc.depositar(2000);
		cc.trasferir(1000, ca);
		
		System.out.println("saldo: "+cc.getSaldo());
		System.out.println("saldo: "+ca.getSaldo());
	}
}
