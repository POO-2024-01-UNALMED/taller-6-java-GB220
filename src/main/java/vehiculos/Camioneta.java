package vehiculos;

public class Camioneta extends Vehiculo{
	
	private boolean volco;
	private static int cantidadVehiculos;
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, long precio, int peso, String traccion,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.setVolco(volco);
		Camioneta.cantidadVehiculos+=1;
	}
	public Camioneta(String placa, int puertas, String nombre, long precio, int peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.setVolco(volco);
		Camioneta.cantidadVehiculos+=1;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Camioneta.cantidadVehiculos = cantidadVehiculos;
	}
	

}
