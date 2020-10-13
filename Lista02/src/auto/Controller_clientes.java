package auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller_clientes {
	List<Cliente> clientes = new ArrayList<>();
	List<Carro> carros = new ArrayList<>();
	
	public String generate_Hex_Code() {
        Random random = new Random();
        int val = random.nextInt();
        String Code = new String();
        Code = Integer.toHexString(val);
        
        return Code;
	}
	
	public void Registrar_clientes(String nome, String telefone, String endereço, String documento, int concessionaria ) {
		this.clientes.add(new Cliente(this.generate_Hex_Code(), nome, telefone, endereço, documento, concessionaria));
	}
	
	
	public void Registrar_carros(String numPlaca, String modelo, String anoFabric, String preço) {
		this.carros.add(new Carro(modelo, numPlaca, anoFabric, preço));
	}
	

	public void List() {
		this.clientes.forEach(cliente -> System.out.println(cliente));
		this.carros.forEach(carro -> System.out.println(carro));
		if(clientes.isEmpty()) {
			System.out.println("Não temos clientes cadastrado");
		}
	}

}