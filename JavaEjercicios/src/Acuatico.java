
public class Acuatico extends Robot{
	
	private double nivel_profundidad_alcanzado;
	
	public Acuatico(String id, int modelo, double precio, double peso, int contador, double nivel)
	{
		super(id, modelo, precio, peso, contador);
		this.setNivel_profundidad_alcanzado(nivel);
	}
	
	public double getNivel_profundidad_alcanzado() {
		return nivel_profundidad_alcanzado;
	}

	public void setNivel_profundidad_alcanzado(double nivel_profundidad_alcanzado) {
		this.nivel_profundidad_alcanzado = nivel_profundidad_alcanzado;
	}

	public int operaRobot()
	{
		return this.contador - 1;
	}
}
