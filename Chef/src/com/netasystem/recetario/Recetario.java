package com.netasystem.recetario;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



/**
 * The Class Recetario.
 */
public class Recetario {
	
	/** The listado. */
	private Map<String,Receta> listado;
	
	
	/**
	 * Instantiates a new recetario.
	 */
	public Recetario() {
		listado = new HashMap<String, Receta>();
	}
	
	
	/**
	 * Mostrar list.
	 */
	public void mostrarList() {
		Set<String> key = listado.keySet();
		for(String k : key) {
			System.out.println(k);
			Receta r = listado.get(k);
			r.mostrarIngredientes();
			r.mostrarProcedimiento(); 
		}
	} 
	
	/**
	 * Agregar receta.
	 *
	 * @param nombre the nombre
	 * @param r the r
	 */
	public void agregarReceta(String nombre,Receta r) {
		listado.put(nombre, r);
	}
	

	/**
	 * Quitar receta.
	 *
	 * @param nombre the nombre
	 * @return true, if successful
	 */
	public boolean quitarReceta(String nombre){
		if(checkNombre(nombre)) {
			Receta r = listado.remove(nombre);
			if( r!=null) return true; return false;
		}else {
			System.out.println("El nombre de la receta no existe...");
			return false;
		}
		
	}
	
	
	/**
	 * Lista L laves.
	 *
	 * @return the sets the
	 */
	public Set<String> listaLLaves() {
		return listado.keySet();
	}
	
	/**
	 * Check nombre.
	 *
	 * @param n the n
	 * @return true, if successful
	 */
	public boolean checkNombre(String n) {
		return this.listado.containsKey(n);
	}
	
	/**
	 * Gets the listado.
	 *
	 * @return the listado
	 */
	public Map<String, Receta> getListado() {
		return listado;
	}


	/**
	 * Sets the listado.
	 *
	 * @param listado the listado
	 */
	public void setListado(Map<String, Receta> listado) {
		this.listado = listado;
	}
}