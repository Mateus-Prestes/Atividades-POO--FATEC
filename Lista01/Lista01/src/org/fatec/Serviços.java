package org.fatec;

public class Serviços {
	String nome;
	int id;
	
	public Serviços(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	@Override
	public String toString() {
		String info =  this.nome;
		return info;
	}
}	
