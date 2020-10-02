package org.fatec;

public class Adm {
	
	public void Run(int store) {
		Controll_clientes services = new Controll_clientes();
		Controll_scanner controle = new Controll_scanner();
		Controll_services service = new Controll_services();

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
				
				services.RegisterClients(nome, telefone, aniversario, genero, store);
				System.out.println("\nCliente cadastrado com sucesso!");
			}
			
			if (opção == 2) {
				int listopção = 0;
				Menu.Listing();
				
				listopção = controle.opc();
				
				if (listopção == 1) {
					services.sortByDate();
				}
				
				if (listopção == 2) {
					System.out.println("A vizualização será por genero ? (S/N)");

					String response = controle.text().toUpperCase();
					System.out.println(response);
					
					if (response.equals("S")) {
						System.out.println("Informe o genero (M/F)");
						String gender = controle.text().toUpperCase();
						
						if (gender.equals("M")) {
							services.sortByName(gender);
						} else if (gender.equals("F")) {
							services.sortByName(gender);
						} else {
							System.out.println("ERRO! Opção inválida!");
						}
					} else {
						services.sortByName("0");
					}					
				}
				
				if (listopção == 3) {
					opção = 8;
				}		
			}
			
			if (opção == 3) {
				System.out.println("Entre com o ID do usuário que será deletado");
				
				services.removeClient(controle.text());
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
				
				services.updateClient(id, nome, phone, birth, gender);
			}	
			
			if (opção == 5) {
				service.Run();
				service.listServices();
			}	
		}
	}
}