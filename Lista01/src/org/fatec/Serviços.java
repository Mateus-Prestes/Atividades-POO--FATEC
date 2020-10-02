package org.fatec;

public class Serviços {
	String nome;
	String toGender;
	
	public Serviços(String nome, String genero) {
		this.nome = nome;
		this.toGender = genero;
	}
	
	@Override
	public String toString() {
		String info =  this.nome;
		return info;
	}
}	
