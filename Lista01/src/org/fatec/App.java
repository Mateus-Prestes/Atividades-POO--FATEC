package org.fatec;

public class App {

	public static void main(String[] args) {
		Controll_scanner controle = new Controll_scanner();
		
		int opção = 0;
		
		while (opção != 4) {	
			System.out.println("\n\n*  *  *  *  *  *  *  *  *");
			System.out.println("  	World Beauty");
			System.out.println(" - - - - - - - - - - - - - - -");
			System.out.println("| Selecione a Filial          |");
			System.out.println("| 1 - WB Matris               |");
			System.out.println("| 2 - WB Filial 1             |");
			System.out.println("| 3 - WB Filial 2             |");
			System.out.println("| 4 - Sair                    |");
			System.out.println(" - - - - - - - - - - - - - - -");
			System.out.println("*  *  *  *  *  *  *  *  *  *");
			
			opção = controle.opc();	
			
			if (opção != 4) {
				Adm admin = new Adm();
				admin.Run(opção);		
			}
		}
		
		
		System.out.println("\nPrograma finalizado!");
	}

}