package vehiculos;

public class Automovil extends Vehiculo{
	
	private int puestos;
	private static int cantidadVehiculos = 0;

	Automovil(String placa, int puertas, int velocidadMaxima, String nombre, long precio, int peso, String traccion,
			Fabricante fabricante, int puestos) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.setPuestos(puestos);
		Automovil.cantidadVehiculos+=1;
	}
	Automovil(String placa, String nombre, long precio, int peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.setPuestos(puestos);
		Automovil.cantidadVehiculos+=1;
		
	}
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Automovil.cantidadVehiculos = cantidadVehiculos;
	}
}
