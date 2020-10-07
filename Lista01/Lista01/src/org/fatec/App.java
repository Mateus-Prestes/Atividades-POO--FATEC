package org.fatec;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Controll_scanner controle = new Controll_scanner();
		Controll_services serviços = new Controll_services();
		
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
			
			if (opção != 0) {
				Adm adm = new Adm();
				serviços.Run();
				adm.Run(opção, serviços);	
			}
		}
		
		System.out.println("\nPrograma finalizado!");
	}

}