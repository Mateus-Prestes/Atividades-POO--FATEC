package org.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Adm {
	
	public void Run(int store, Controll_services service) throws IOException, ClassNotFoundException{
		Controll_clientes serviços = new Controll_clientes();
		Controll_scanner controle = new Controll_scanner();
		Controll_services serviço = new Controll_services();
		
		String path = "/Desktop/Agoravai.ser";

		int opção = 8;
		
		while (opção != 0) {
			Menu.Admin();
			opção = controle.opc();
			
			if (opção == 1) {
				System.out.print("Entre com o nome: ");
				String nome = controle.text();
				
				System.out.print("Entre com o telefone: ");
				String telefone = controle.text();
				
				System.out.print("Entre com a data de nascimento: ");
				String aniversario = controle.text();
				
				System.out.print("Entre com o genero (M/F): ");
				String genero = controle.text().toUpperCase();
				while (!(genero.equals("M") || genero.equals("F"))) {
					System.out.println("\nGênero deve ser M ou F");
					System.out.print("Entre com o genero (M/F): ");
					genero = controle.text().toUpperCase();
				}
				
				serviços.RegisterClients(nome, telefone, aniversario, genero, store);
				System.out.println("\nCliente cadastrado com sucesso!");
			}
			
			if (opção == 2) {
				int listopção = 0;
				Menu.Listing();
				
				listopção = controle.opc();
				
				if (listopção == 1) {
					serviços.sortByDate();
				}
				
				if (listopção == 2) {
					System.out.println("A vizualização será por genero ? (S/N)");

					String response = controle.text().toUpperCase();
					System.out.println(response);
					
					if (response.equals("S")) {
						System.out.println("Informe o genero (M/F)");
						String genero = controle.text().toUpperCase();
						
						if (genero.equals("M")) {
							serviços.sortByName(genero, false);
						} else if (genero.equals("F")) {
							serviços.sortByName(genero, false);
						} else {
							System.out.println("ERRO! Opção inválida!");
						}
					} else {
						serviços.sortByName("0", false);
					}					
				}
				
				if (listopção == 3) {
					opção = 8;
				}		
			}
			
			if (opção == 3) {
				System.out.println("Entre com o ID do usuário que será deletado");
				
				serviços.removeClient(controle.text());
			}
			
			if (opção == 4) {
				System.out.println("Entre com o ID do usuário que será atualizado");
				String id = controle.text();
				
				System.out.print("Entre com o nome: ");
				String nome = controle.text();
				
				System.out.print("Entre com o telefone: ");
				String phone = controle.text();
				
				System.out.print("Entre com a data de nascimento: ");
				String birth = controle.text();
				
				System.out.print("Entre com o genero: ");
				String gender = controle.text().toUpperCase();
				while (!(gender.equals("M") || gender.equals("F"))) {
					System.out.println(gender);
				}
				
				serviços.updateClient(id, nome, phone, birth, gender);
			}	
			
			if (opção == 5) {
				serviço.listaServiços();
				int serviço_Escolhido = controle.opc();
				System.out.println("\n............................................");
				System.out.println("Escolha o usuário pelo ID para consumir o serviço");
				System.out.println("............................................\n");
				serviços.sortByName("0", true);
				
				String userId = controle.text();
				serviços.insertServices(userId, serviço_Escolhido, serviço);
				
			}	
			
			if (opção == 6) {
				Menu.Relatorios();
				
				int escolhaRelatorio = controle.opc();
				
				if (escolhaRelatorio == 1) {
					System.out.println("Escolha dentre as 3 opções abaixo");
					System.out.println("F - Feminina");
					System.out.println("M - Masculino");
					System.out.println("G - Geral");
					
					String escolhaGenero = controle.text();
					
					int idade_Media = serviços.getMiddleAge(escolhaGenero);
					
					System.out.println("A idade média dos clientes é " + idade_Media + " anos.");
				}
				
				if (escolhaRelatorio == 2) {
					serviço.printMostUsed();
				}
				
				if (escolhaRelatorio == 3) {
					System.out.println("\n............................................");
					System.out.println("Escolha o usuário pelo ID");
					System.out.println("............................................\n");
					serviços.sortByName("0", true);
					
					System.out.println("Digite o id do usuário");
					String userId = controle.text();
					
					serviços.listServices(userId, serviço);
				}
			}
			
			if (opção == 7) {
				FileOutputStream canal = new FileOutputStream(path);
				ObjectOutputStream escritor = new ObjectOutputStream(canal);
				escritor.writeObject(serviços.array_clients);
				escritor.close();
				System.out.println("Cadastros de clientes salvo com sucesso!");
			}
			
			if (opção == 8) {
				FileInputStream canal = new FileInputStream(path);
				ObjectInputStream leitor = new ObjectInputStream(canal);
				// casting / cast -> casca
				serviços.array_clients = (List<Clientes>) leitor.readObject();
			
				leitor.close();
				System.out.println("Cadastros lidos com sucesso!");
			}
		}
	}
}
