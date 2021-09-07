package com.dio;

public class primeiroPrograma {

	public static void main(String[] args) {
		
		gato gato = new gato();
		gato.setNome("Tom");
		gato.setCor("Cinza");
		gato.setIdade(99);
		
		System.out.println(gato.hashCode());
	

	}

}
