package banco;

public class Euro extends Moeda {

	public Euro(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override //Método que imprime informações sobre valor de Euro
	public void info() { 
		System.out.println("Euro - " + valor );
		
	}

	@Override //Método de conversão euro para real
	public double converter() {
		return this.valor * 5.37; 
	}
	
	@Override 
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
		}
		
		Euro objetoEuro = (Euro) objeto; 
		
		if (this.valor != objetoEuro.valor) {
			return false;
			
		}
		
		return true;
		
	}
	
}
