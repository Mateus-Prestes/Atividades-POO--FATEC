package org.fatec;

import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Controll_clientes {
	List<Clientes> array_clients = new ArrayList<>();
	
	public Controll_clientes() {
//		this.clients = [];
	}
	
	public String generateHexCode() {
        Random random = new Random();
        int val = random.nextInt();
        String Code = new String();
        Code = Integer.toHexString(val);
        
        return Code;
	}
	
	public void RegisterClients(String nome, String telefone, String aniversario, String genero, int store ) {
		Date date = new Date();
		
		this.array_clients.add(new Clientes(this.generateHexCode(), nome, telefone, aniversario, genero, date, store ));
	}
	
	public void sortByDate() {
		Collections.sort(array_clients, new Comparator<Clientes>(){ 
			 @Override 
			public int compare(Clientes client1, Clientes client2){ 
			  return client1.cria_at.compareTo(client2.cria_at); 
			} 
		});
		
		this.array_clients.forEach(client -> System.out.println(client));
	}
	
	public void removeClient(String id) {
		Iterator<Clientes> client = array_clients.iterator();
		
		while (client.hasNext()){ 
			   Clientes atual = client.next(); 
			       if (atual.id.equals(id)) { 
			            client.remove(); 
			   } 
			}
		
		System.out.println("Este cliente foi excluido!");
	}

	public void updateClient(String id, String nome_novo, String telefone_novo, String aniversario_novo, String genero_novo) {
		Iterator<Clientes> client = array_clients.iterator();
		
		while (client.hasNext()){ 
			   Clientes atual = client.next(); 
			       if (atual.id.equals(id)) {
			    	   atual.nome = nome_novo;
			    	   atual.telefone = telefone_novo;
			    	   atual.aniversario = aniversario_novo;
			    	   atual.genero = genero_novo;
			   } 
			}
		
		System.out.println("\nCliente atualizado com sucesso!");
	}
	
	public void sortByName(String genero) {
		Collections.sort(array_clients, new Comparator<Clientes>(){ 
			 @Override 
			public int compare(Clientes client1, Clientes client2){ 
			  return client1.nome.compareTo(client2.nome); 
			} 
		});
		
		this.array_clients.forEach(client -> {
			if (genero.equals("0")) {
				System.out.println(client);
			} else if (genero.equalsIgnoreCase(client.genero)) {
				System.out.println(client);
			}
		});
	}
}