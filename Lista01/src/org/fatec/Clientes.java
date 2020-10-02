package org.fatec;

import java.util.Date;

public class Clientes {
	String id;
	String nome;
	String genero;
	String telefone;
	String aniversario;
	Date cria_at;
	int store;
	
	
	public Clientes ( String id, String nome, String telefone, String aniversario, String genero, Date cria_at, int store) {
		this.nome = nome;
		this.telefone = telefone;
		this.aniversario = aniversario;
		this.genero = genero;
		this.id = id;
		this.cria_at = cria_at;
		this.store = store;
	}
	
	public String toString() {
		String information =
					"\nId: " + id +
					"\nNome: " + nome + 
					"\nTelefone: " + telefone + 
					"\nData de nascimento: " + aniversario + 
					"\nGenero: " + genero +
					"\nCriado em: " + cria_at +
					"\nLoja: " + store;
		
		return information;
	}
}