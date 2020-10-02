package org.fatec;

import java.util.Scanner;

public class Controll_scanner {
	private Scanner leitor;	
	
	public Controll_scanner() {
		leitor = new Scanner(System.in);
	}

	public synchronized int opc() {
		int op = leitor.nextInt();
		leitor = leitor.reset();
		return op;
	}

	public synchronized String text() {
		leitor = new Scanner(System.in);
		String t = leitor.nextLine();
		leitor = leitor.reset();
		return t;
	}

	@Override
	protected void finalize() throws Throwable {
		leitor.close();
	}
}