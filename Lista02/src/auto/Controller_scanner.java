package auto;

import java.util.Scanner;

public class Controller_scanner {
	private Scanner reader;

	public Controller_scanner() {
		reader = new Scanner(System.in);
	}

	public synchronized int opc() {
		int op = reader.nextInt();
		reader = reader.reset();
		return op;
	}

	public synchronized String txt() {
		reader = new Scanner(System.in);
		String t = reader.nextLine();
		reader = reader.reset();
		return t;
	}

	@Override
	protected void finalize() throws Throwable {
		reader.close();
	}
}