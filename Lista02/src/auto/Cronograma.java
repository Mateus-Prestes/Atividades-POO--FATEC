package auto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cronograma implements Serializable{
	public String id;
	public String data;
	public String hora;
		
	public Cronograma(String id, String data, String hora) {
		this.id = id;
		this.data = data;
		this.hora = hora;
	}
		
	@Override
	public String toString() {
		
		String informativo =
				"\n\n - - - - - - - - - - - - - - - - - -" +
				"  ****** Agendamento de revisões ******  " + 
				"\n\n - - - - - - - - - - - - - - - - - -" +		
				"\nID do cliente: " + id + 
				"\nData: " + data + 
				"\nHorario: " + hora +
				"\n\n - - - - - - - - - - - - - - - - - -";
		
		return informativo;
	}	
}