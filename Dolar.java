package banco;

public class Dolar extends Moeda {
	
	public Dolar(double valorInicial) {
		this.valor = valorInicial;
	}
	
	@Override //Método que imprime informações sobre valor de Dólar
	public void info() {  
		System.out.println("Dolar - " + valor );
		
	}

	@Override  //Método de conversão dólar para real
	public double converter() {
		return this.valor * 4.97;
		
	}
	
	@Override 
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
		}
		
		Dolar objetoDolar = (Dolar) objeto; 
		
		if (this.valor != objetoDolar.valor) {
			return false;
			
		}
		
		return true;
		
	}

}
