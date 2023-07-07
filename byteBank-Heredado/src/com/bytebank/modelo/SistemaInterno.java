package com.bytebank.modelo;

public class SistemaInterno {
	
	private String clave = "12345";
	
	// todo lo que tenga esta esta etiqueta va poder ejecutar este metodo
	public boolean autenticar(Autenticar gerente) {
		boolean pIs = gerente.autenticar(this.clave);
		if(pIs) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
