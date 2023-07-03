package banco;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>(); // Inicia com lista de moedas vazia.
	}
	
	// Método adicionar moeda
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
		
				
	}
	
	// Método remover moeda
	public void remover(Moeda moedas) {
		this.listaMoedas.remove(moedas);
		
	}
	
	// Método listagem de moedas
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
				System.out.println("No momento sem moedas no cofrinho.");
				return;
		}
		
		for (Moeda moeda : this.listaMoedas) { 
		moeda.info();	
		
		}
	
	}
	
	// Método total convertido
	public double totalConvertido() {
		
		if (this.listaMoedas.isEmpty()) {
		return 0;
		
		}
		
		
	double valorAcumulado = 0; 
	
	for (Moeda moeda : this.listaMoedas) { 
		valorAcumulado = valorAcumulado + moeda.converter();
		
		}
	
		return valorAcumulado;
	}
}


