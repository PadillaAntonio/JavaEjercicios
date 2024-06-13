
public class Espacial extends Robot {
	
	private double temperatura_soportada;
	
	public Espacial(String id, int modelo, double precio, double peso, int contador, double temperatura)
	{
		super(id, modelo, precio, peso, contador);
		this.temperatura_soportada = temperatura;
	}

	public double getTemperatura_soportada() {
		return temperatura_soportada;
	}

	public void setTemperatura_soportada(double temperatura_soportada) {
		this.temperatura_soportada = temperatura_soportada;
	}
	
	public int operaRobot()
	{
		return this.contador * 2;
	}
}
