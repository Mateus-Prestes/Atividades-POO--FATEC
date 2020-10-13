package auto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Carro implements Serializable{
	public String modelo;
	public String numPlaca;
	public String anoFabric;
	public String preço;
	
	public Carro( String modelo, String numPlaca, String anoFabric, String preço) {
		this.modelo = modelo;
		this.numPlaca = numPlaca;
		this.anoFabric = anoFabric;
		this.preço = preço;
	}
	
	@Override
	public String toString() {
		String informativo = 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\n\n  Veículos  " + 
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=" +
				"\nModelo/Versao: " + modelo + 
				"\nNumero da Placa: " + numPlaca + 
				"\nAno de Fabricacao: " + anoFabric + 
				"\nValor de compra: " + preço +
				"\n\n=-=-=-=-=-=-=-=-=-=-=-=-=-=";
		
		return informativo;
	}
}