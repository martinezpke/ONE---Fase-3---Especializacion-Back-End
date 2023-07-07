package com.bytebank.test;

public class TestGerente {
	 public static void main(String[] args) {
		com.bytebank.modelo.Gerente kevin = new com.bytebank.modelo.Gerente();
		kevin.setName("Kevin");
		kevin.setCC("1234567890");
		kevin.setSalario(1000);
		
		System.out.println(kevin.getName());
		System.out.println(kevin.getBonificacion());
	}
}
