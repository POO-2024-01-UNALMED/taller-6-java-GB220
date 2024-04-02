package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	
	private String nombre;
	int contador;
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	static ArrayList<Integer> listaConteo = new ArrayList<Integer>();
	
	public Pais (String nombre){
		this.nombre = nombre;
		paises.add(this);
	}
	
	
	static void agregarContador() {
		for (Pais pais : paises) {
			listaConteo.add(pais.contador);
		}
	}
	public static Pais paisMasVendedor() {
		agregarContador();
		int maximo = Collections.max(listaConteo);
		Pais paisMasVendedor = null;
		
		
		for (Pais pais : paises) {
			if (pais.contador == maximo) {
				paisMasVendedor = pais;
			}
		}
		return paisMasVendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
