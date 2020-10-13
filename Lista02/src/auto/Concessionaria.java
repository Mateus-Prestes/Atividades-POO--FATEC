package auto;

import auto.App;
import auto.Controller_scanner;

public class Concessionaria {
	public static void main(String[] args) throws Exception {
		Controller_scanner controller = new Controller_scanner();
		
		int escolha = 0;
		
		
		while (escolha == 0) {
			System.out.println("\n\n - - - - - - - - - - - - - - - - - -");
			System.out.println("  Concessionárias Xing-Ling ");
			System.out.println(" - - - - - - - - - - - - - - - - - -");
			System.out.println("  Selecione uma das concessionária  ");
			System.out.println("1 - Concessionária Ping-Pong");
			System.out.println("2 - Concessionária do China");
			System.out.println("3 - Concessionária Samurai");
			System.out.println("10 - Sair");
			System.out.println(" - - - - - - - - - - - - - - - - - -");
			
			escolha = controller.opc();		
		}
		
		App app = new App();
		app.Run(escolha);
	}
}