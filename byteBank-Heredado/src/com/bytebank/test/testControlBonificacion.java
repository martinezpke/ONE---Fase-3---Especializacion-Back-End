package com.bytebank.test;

public class testControlBonificacion {
	public static void main(String[] args) {
		com.bytebank.modelo.Funcionario kevin = new com.bytebank.modelo.Contador();
		kevin.setName("Kevin");
		kevin.setSalario(1000);
		
		com.bytebank.modelo.Gerente maria = new com.bytebank.modelo.Gerente();
		maria.setName("maria");
		maria.setSalario(10000);
		 
		com.bytebank.modelo.Contador carlos = new com.bytebank.modelo.Contador();
		carlos.setName("carlos");
		carlos.setSalario(5000);
		
		com.bytebank.modelo.ControlBonificacion controlBonificacion = new com.bytebank.modelo.ControlBonificacion();
		 
		 controlBonificacion.registrarSalario(kevin);
		 controlBonificacion.registrarSalario(maria);
		 controlBonificacion.registrarSalario(carlos);
	}
}
