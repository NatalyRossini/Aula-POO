package banco;

public abstract class Moeda { //classe mãe abstrata de outras classes específicas de Dolar, Euro, Real.
	
	double valor;
	
	public abstract void info();
	public abstract double converter();
}
