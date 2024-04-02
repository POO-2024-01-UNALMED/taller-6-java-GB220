package vehiculos;

public class Camion extends Vehiculo{
	
	private int ejes;
	private static int cantidadVehiculos = 0;
	

	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, long precio, int peso, String traccion,
			Fabricante fabricante, int ejes) {
		super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
		this.setEjes(ejes);
		Camion.cantidadVehiculos+=1;
	}
	
	public Camion(String placa, String nombre, long precio, int peso,
			Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.setEjes(ejes);
		Camion.cantidadVehiculos+=1;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Camion.cantidadVehiculos = cantidadVehiculos;
	}

}
