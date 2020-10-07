package org.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clientes implements Serializable {
	String id;
	String nome;
	String genero;
	String telefone;
	String aniversario;
	Date cria_at;
	int store;
	
	List<Integer> serviços = new ArrayList<>();
	
	public Clientes ( String id, String nome, String telefone, String aniversario, String genero, Date cria_at, int store) {
		this.nome = nome;
		this.telefone = telefone;
		this.aniversario = aniversario;
		this.genero = genero;
		this.id = id;
		this.cria_at = cria_at;
		this.store = store;
	}
	
	
	public void addServiços (int Serviços) {
		this.serviços.add(Serviços);
	}
	
	public void listaServiços (Controll_services serviços) {
		
		for (int each : this.serviços) {
			serviços.printServiços(each);
		}
	}	
	@Override	
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