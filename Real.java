package banco;

public class Real extends Moeda {

	public Real(double valorInicial) {
		this.valor = valorInicial; //refere-se ao atributo que faz parte da classe (Moeda e também real)
		
	}
	
	@Override
	public void info() { //Método que imprime informações sobre valor de real
		System.out.println("Real - " + valor);		
	}

	@Override //Método converter, retorna o próprio valor de Real
	public double converter() {
		return this.valor;		
	}
	
	@Override 
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
			
		}
		
		Real objetoReal = (Real) objeto; 
		
		if (this.valor != objetoReal.valor) {
			return false;
			
		}
		
		return true;
		
	}
	
}
