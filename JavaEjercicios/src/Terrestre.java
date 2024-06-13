
public class Terrestre extends Robot {
	
	private double velocidad;
	
	public Terrestre(String id, int modelo, double precio, double peso, int contador, double velocidad)
	{
		super(id, modelo, precio, peso, contador);
		this.setVelocidad(velocidad);
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public int operaRobot()
	{
		return this.contador + 1;
	}
}
