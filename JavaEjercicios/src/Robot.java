
public abstract class Robot {

	protected String id;
	protected int modelo;
	protected double precio;
	protected double peso;
	protected int contador;
	
	public Robot(String id, int modelo, double precio, double peso, int contador) {
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
		this.peso = peso;
		this.contador = contador;
	}
	
	public int getContador() {
		return contador;
	}
	
	public String getId() {
		return id;
	}
	
	public int getModelo() {
		return modelo;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int operaRobot()
	{
		return this.contador;
	}
}
