package com.netasystem.recetario;

import java.util.List;



/**
 * The Class Receta.
 */
public class Receta {
	
	/** The nombre. */
	private String nombre;
	
	/** The autor. */
	private String autor;
	
	/** The ingredientes. */
	private List<Ingrediente> ingredientes;
	
	/** The procedimiento. */
	private List<String> procedimiento;
	
	
	/**
	 * Instantiates a new receta.
	 *
	 * @param autor the autor
	 * @param ingredientes the ingredientes
	 * @param procedimiento the procedimiento
	 */
	public Receta(String autor, List<Ingrediente> ingredientes, List<String> procedimiento) {
		super();
		if(autor.isEmpty()) {
			System.out.println("Nombre de la receta y/o nombre del autor vacio");
		}else {
		this.autor = autor;
		this.ingredientes = ingredientes;
		this.procedimiento = procedimiento;
		}
	}	
	
	
	/**
	 * Mostrar procedimiento.
	 */
	public void mostrarProcedimiento() {
		for(String s : procedimiento) {
			System.out.println(s);
		}
	}
	
	/**
	 * Mostrar ingredientes.
	 */
	public void mostrarIngredientes() {
		for(Ingrediente i : ingredientes) {
			System.out.println(i.getNombre()+"  "+i.getcantidad());
		}
	}

	
	/**
	 * Gets the autor.
	 *
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}
	
	
	/**
	 * Sets the autor.
	 *
	 * @param autor the new autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * Gets the ingredientes.
	 *
	 * @return the ingredientes
	 */
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	/**
	 * Sets the ingredientes.
	 *
	 * @param ingredientes the new ingredientes
	 */
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	/**
	 * Gets the procedimiento.
	 *
	 * @return the procedimiento
	 */
	public List<String> getProcedimiento() {
		return procedimiento;
	}
	
	/**
	 * Sets the procedimiento.
	 *
	 * @param procedimiento the new procedimiento
	 */
	public void setProcedimiento(List<String> procedimiento) {
		this.procedimiento = procedimiento;
	}
	
}