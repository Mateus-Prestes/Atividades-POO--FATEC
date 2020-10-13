package auto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

public class App {
	@SuppressWarnings("unchecked")
	public void Run(int concessionaria) throws Exception {
		String path = "~/Desktop/revisao.txt";

		Controller_scanner controller = new Controller_scanner();
		Controller_clientes services = new Controller_clientes();
		Controller_Cronograma scheduling = new Controller_Cronograma();
	
		int escolha = 0;

		while (escolha != 10) {
			Menu.showMenu();
			escolha = controller.opc();
			
			if (escolha == 1) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Cadastro de novos Clientes  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				System.out.print("Informe o nome: ");
				String nome = controller.txt();
				
				System.out.println("Informe o telefone: ");
				String telefone = controller.txt();
				
				System.out.println("Infotme o endereço: ");
				String endereço = controller.txt();
				
				System.out.println("Informe o RG/CPF: ");
				String documento = controller.txt();
				
				System.out.println("irá cadastrar um veiculo? (S/N)");
				String op = controller.txt();
				if(op.equals("S") || op.equals("N")) {
					if(op.equals("S")) {
						System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
						System.out.println("  Cadastro de novos Veiculos  ");
						System.out.println(" - - - - - - - - - - - - - - - - - -");
						System.out.println("Informe a placa do veículo: ");
						String numPlaca = controller.txt();
						
						System.out.println("Informe o modelo/versao: ");
						String modelo = controller.txt();
						
						System.out.println("Informe o ano de fabricacao: ");
						String anoFabric = controller.txt();
						
						System.out.println("Informe o valor de compra: ");
						String preço = controller.txt();
						
						services.Registrar_carros(modelo, numPlaca, anoFabric, preço);
						System.out.println("\n****** O Veiculo cadastrado!  ******");
					}
					
					
				}else {
					System.out.println("Ops, sua opção está incorreta!\nPor favor entre com S ou N.");
					op = controller.txt();
				}
				
				services.Registrar_clientes(nome, telefone, endereço, documento, concessionaria);
				System.out.println("\n****** O cliente foi cadastrado!  ******");
			}
			
			if (escolha == 2) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Listar Clientes  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				services.List();
			}
			
			
			if(escolha == 3) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Agendamento de Revisaões  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				System.out.println("Informe o ID do cliente: ");
				String id = controller.txt();
				System.out.println("Informe a data da revisão (dd/mm/aa)");
				String data = controller.txt();
				System.out.println("Informe o horario da revisão");;
				String hora = controller.txt();
				
				scheduling.Registrar_cronograma(id, data, hora);
				System.out.println("\n******  Agendamento realizado!  ******");
			}
			
			  
			if (escolha == 4) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Excluir Agendamento de Revisao  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				System.out.println("Informe o ID do cliente que ira excluir o agendamento: ");
				String deletar_Id = controller.txt();
					for (Cronograma roam : scheduling.cronograma ) {
						if (roam.id.equals(deletar_Id)) {
							scheduling.cronograma.remove(roam);
							System.out.println("\n****** O agendamento do cliente com ID " + deletar_Id + " foi excluido!  ******");
							break;
						}
					}
			}
			
		 
			if (escolha == 5) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Editar Agendamento de Revisao  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				System.out.println("Informe o nome ID do cliente que ira mudar a data do agendamento: ");
				String Nome_cliente = controller.txt();
					for (Cronograma roam : scheduling.cronograma ) {
						if (roam.id.equals(Nome_cliente)) {
							System.out.println("Informe a nova data: ");
							String newDate = controller.txt();
							roam.data = newDate;
							System.out.println("\n****** A data do agendamento do cliente " + Nome_cliente + " foi alterado!  ****** ");
						}
					}
			}

			
			if (escolha == 6) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Lista de Agendamentos de Revisão  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				scheduling.Listar_cronograma();
			}
			
			
			if (escolha == 7) {
				FileOutputStream channel = new FileOutputStream(path);
				ObjectOutputStream writer = new ObjectOutputStream(channel);
				writer.writeObject(services.clientes);
				writer.writeObject(services.carros);
				writer.writeObject(scheduling.cronograma);
				writer.close();
				System.out.println("\n******   Os cadastros dos clientes agora estão salvos!  ******");
			}

			if (escolha == 8) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Leitura de Arquivos  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				FileInputStream channel = new FileInputStream(path);
				ObjectInputStream reader = new ObjectInputStream(channel);
				services.clientes = (List<Cliente>) reader.readObject();
				services.carros = (List<Carro>) reader.readObject();
				scheduling.cronograma = (List<Cronograma>) reader.readObject();
				reader.close();
				System.out.println("\n******  Os cadastros foram lidos!  ******");
			}
			
			
			if (escolha == 9) {
				System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
				System.out.println("  Relatórios  ");
				System.out.println(" - - - - - - - - - - - - - - - - - -");
				FileWriter file = new FileWriter("~/Desktop/relatorio.txt");
			    PrintWriter saveFile = new PrintWriter(file);
			    
			    services.clientes.forEach(person -> saveFile.print(person));
			    services.carros.forEach(car -> saveFile.print(car));			    
			    scheduling.cronograma.forEach(schedule -> saveFile.print(schedule));
				System.out.println("\n******  O Relatório foi gerado!  ****** ");
				file.close();
			}
		}
		
		System.out.println("\n******   Encerrando...  ******");
	}
}