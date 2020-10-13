package auto;
import java.util.ArrayList;
import java.util.List;


public class Controller_Cronograma {
	List<Cronograma> cronograma = new ArrayList<>();
	
	public void Registrar_cronograma(String id, String data, String hora) {
			this.cronograma.add(new Cronograma (id, data, hora));
	}
	
	public void Listar_cronograma() {
		this.cronograma.forEach(client -> System.out.println(client));
		if(cronograma.isEmpty()) {
			System.out.println("\n******* Nao existem agendamentos *******");
		}
	}
}