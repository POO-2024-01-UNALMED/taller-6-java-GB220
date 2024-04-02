package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
	
	private String nombre;
	private static Map<Pais, Integer> contadorInstancias = new HashMap<>();
	
	public Pais (String nombre){
		this.nombre = nombre;
		Pais.contadorInstancias.put(this, Pais.contadorInstancias.getOrDefault(this, 0) + 1);
	}
	
	public static Pais paisMasVendedor() {
		Pais instanciaMasUsada = null;
		int maxConteo = 0;
		
		for (Map.Entry<Pais, Integer> entry : contadorInstancias.entrySet()) {
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
	
	

}
