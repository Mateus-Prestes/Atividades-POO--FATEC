package org.fatec;

import java.util.ArrayList;
import java.util.List;

public class Controll_services {
	List<Serviços> serviços = new ArrayList<Serviços>();
	
	public Controll_services() {
		// TODO Auto-generated constructor stub
	}
	
	public void Run() {
		this.serviços.add(new Serviços("[1] - Design de  sobrancelhas,", "F"));		
		this.serviços.add(new Serviços("[2] - Manicure", "F"));
		this.serviços.add(new Serviços("[3] - Pedicure", "F"));
		this.serviços.add(new Serviços("[4] - Corte e pintura de cabelo", "F"));
		this.serviços.add(new Serviços("[5] - Remoção de manchas na pele", "F"));
		this.serviços.add(new Serviços("[6] - Aplicação de botox", "F"));
		this.serviços.add(new Serviços("[7] - Tratamento para emagrecimento", "F"));
		this.serviços.add(new Serviços("[8] - Redução de medidas", "F"));		
		this.serviços.add(new Serviços("[9] - Corte de cabelo","M"));
		this.serviços.add(new Serviços("[10] - Modelagem e corte de barba","M"));
		this.serviços.add(new Serviços("[11] - Tratamento para quedas de cabelo","M"));
		this.serviços.add(new Serviços("[12] - Produtos especializados","M"));		
	}
	
	public void listServices() {
		this.serviços.forEach(service -> System.out.println(service));
	}
}