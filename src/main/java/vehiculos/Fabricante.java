package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	private static Map<Fabricante, Integer> contadorInstancias = new HashMap<>();
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.contadorInstancias.put(this, Fabricante.contadorInstancias.getOrDefault(this, 0) + 1);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante instanciaMasUsada = null;
		int maxConteo = 0;
		
		for (Map.Entry<Fabricante, Integer> entry : contadorInstancias.entrySet()) {
			if (entry.getValue() > maxConteo) {
				maxConteo = entry.getValue();
				instanciaMasUsada = entry.getKey();
			}
		}
		return instanciaMasUsada;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	

}
