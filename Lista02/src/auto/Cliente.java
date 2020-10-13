package auto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable{
	public String id;
	public String nome;
	public String telefone;
	public String endereço;
	public String documento;
	public int concessionaria;
	
	public Cliente( String id, String nome, String telefone, String endereço, String documento, int concessionaria) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.endereço = endereço;
		this.documento = documento;
		this.concessionaria = concessionaria;
	}

	@Override
	public String toString() {
		String informativo = 
				"\n\n - - - - - - - - - - - - - - - - - -" +
				"\n\n  Clientes  " + 
				"\n\n - - - - - - - - - - - - - - - - - -" +
				"\nId: " + id + 
				"\nNome: " + nome + 
				"\nTelefone: " + telefone + 
				"\nEndereço: " + endereço + 
				"\nRG/CPF: " + documento + 
				"\nConcessionária: " + concessionaria +
				"\n\n - - - - - - - - - - - - - - - - - -";
		
		return informativo;
	}
}