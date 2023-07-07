package com.bytebank.modelo;


public interface Autenticar {
	
	public void setContraseña(String contrasena) ;

    public  boolean autenticar(String contrasena);

}
