package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class Controll_services {
	List<Serviços> serviços = new ArrayList<Serviços>();
	
	List<Integer> mostUsed = new ArrayList<>();
	
	
	public Controll_services() {
		// TODO Auto-generated constructor stub
	}
	
	public void Run() {
		this.serviços.add(new Serviços("[1] - Design de  sobrancelhas,", 1));		
		this.serviços.add(new Serviços("[2] - Manicure", 2));
		this.serviços.add(new Serviços("[3] - Pedicure", 3));
		this.serviços.add(new Serviços("[4] - Corte e pintura de cabelo", 4));
		this.serviços.add(new Serviços("[5] - Remoção de manchas na pele", 5));
		this.serviços.add(new Serviços("[6] - Aplicação de botox", 6));
		this.serviços.add(new Serviços("[7] - Tratamento para emagrecimento", 7));
		this.serviços.add(new Serviços("[8] - Redução de medidas", 8));		
		this.serviços.add(new Serviços("[9] - Corte de cabelo", 9));
		this.serviços.add(new Serviços("[10] - Modelagem e corte de barba", 10));
		this.serviços.add(new Serviços("[11] - Tratamento para quedas de cabelo", 11));
		this.serviços.add(new Serviços("[12] - Produtos especializados", 12));		
	}
	
	public void listaServiços () {
		this.serviços.forEach(serviços -> System.out.println(serviços));
	}

	public void insertInMostUsed (int serviços) {
		this.mostUsed.add(serviços);
	}
	
	public void printServiços(int serviços ) {
		
		for (Serviços each : this.serviços) {
			if( each.id == serviços) {
				System.out.println(each.nome);
			}
		}
	}
	
	public void printMostUsed() {
		for (int serviços : this.mostUsed) {
			for (Serviços each : this.serviços) {
				if( each.id == serviços) {
					System.out.println(each.nome);
				}
			}
		}
	
	}
}