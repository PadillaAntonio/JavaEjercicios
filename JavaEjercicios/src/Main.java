
public class Main {

	public static void main(String[] args) 
	{
		Robot acua = new Acuatico("01", 2023, 1200, 150.6, 13, 980);
		System.out.println("El contador es: " + acua.operaRobot());
		
		Robot earth = new Terrestre("02", 2001, 550, 250, 25, 120);
		System.out.println("El contador es: " + earth.operaRobot());
		
		Robot space = new Espacial("03", 2005, 800, 600, 99, -30);
		System.out.println("El contador es: " + space.operaRobot());
	}

}
