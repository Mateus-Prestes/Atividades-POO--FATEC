package org.fatec;

public class Menu {
	
	public static void Admin() {
		System.out.println("\n\n*  *  *  *  *  *  *  *  *");
		System.out.println("  	World Beaut  ");
		System.out.println(" - - - - - - - - - - - - - - -");
		System.out.println("| 1 - Cadastrar um cliente    |");
		System.out.println("| 2 - Listar clientes         |");
		System.out.println("| 3 - Remover um cliente      |");
		System.out.println("| 4 - Editar um cliente       |");
		System.out.println("| 5 - Agendar serviço         |");
		System.out.println("| 6 - Ver relatórios          |");
		System.out.println("| 0 - Voltar                  |");
		System.out.println(" - - - - - - - - - - - - - - -");
		System.out.println("\n\n*  *  *  *  *  *  *  *  *");
	}
	
	public static void Listing() {
		System.out.println("\n\n*  *  *  *  *  *  *  *  *");
		System.out.println("    Listar de clientes   ");
		System.out.println(" - - - - - - - - - - - - - - - - - ");
		System.out.println("| 1 - Ordenar por data de criação  |");
		System.out.println("| 2 - Ordenar por ordem alfabética |");
		System.out.println("| 3 - Visualizar um cliente        |"); 
		System.out.println("| 0 - Voltar                       |");
		System.out.println(" - - - - - - - - - - - - - - - - - ");
	}
	

	
	public static void Relatorios() {
		System.out.println("\n\n*  *  *  *  *  *  *  *  *");
		System.out.println("         Relátorios        ");
		System.out.println(" - - - - - - - - - - - - - - -");
		System.out.println("| 1 - Idade média do publico  |");
		System.out.println("| 2 - Serviços mais procurados|");
		System.out.println(" - - - - - - - - - - - - - - -");
	}
	
	public static void viewGeneral() {
		System.out.println("\n\n*  *  *  *  *  *  *  *  *");
		System.out.println("Deseja visualizar todos os dados ou vizualizalos  por genero?");
		System.out.println(" - - - - - - - - - - - - - - - - - - - -");
		System.out.println("| 1 - Visualizar geral                  |");
		System.out.println("| 2 - Visualizar por genero feminino    |");
		System.out.println("| 3 - Visualizar por genero masculinos  |");
		System.out.println(" - - - - - - - - - - - - - - - - - - - -");
	}
}