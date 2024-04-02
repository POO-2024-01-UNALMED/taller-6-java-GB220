package vehiculos;

import java.util.ArrayList;
import java.util.Collections;

public class Fabricante {
	
	private String nombre;
	private Pais pais;
	int contador;
	static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	static ArrayList<Integer> listaConteo = new ArrayList<Integer>();
	
	public Fabricante (String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}
	
	static void agregarContador( ) {
		for (Fabricante fabricante : fabricantes) {
			listaConteo.add(fabricante.contador);
		}
	}
	public static Fabricante fabricaMayorVentas() {
		agregarContador();
		int maximo = Collections.max(listaConteo);
		Fabricante fabricaMayorVentas = null;
		
		for (Fabricante fabricante : fabricantes) {
			if (fabricante.contador == maximo) {
				fabricaMayorVentas = fabricante;
			}
		}
		return fabricaMayorVentas;
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
