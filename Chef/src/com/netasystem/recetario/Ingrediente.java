package com.netasystem.recetario;


/**
 * The Class Ingrediente.
 */
public class Ingrediente {
	
	/** The nombre. */
	private String nombre;
	
	/** The cantidad. */
	private String cantidad;
	
	
	/**
	 * Instantiates a new ingrediente.
	 *
	 * @param nombre the nombre
	 * @param cantidad the cantidad
	 */
	public Ingrediente(String nombre, String cantidad) {
		super();
		if (nombre.isEmpty()||cantidad.isEmpty()) {
			System.out.println("Nombre o/y cantidad vacios...");
		}else {
			this.nombre = nombre;
			this.cantidad = cantidad;	
		}
	}
	
	
	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * Gets the cantidad.
	 *
	 * @return the cantidad
	 */
	public String getcantidad() {
		return cantidad;
	}
	
	/**
	 * Sets the cantidad.
	 *
	 * @param cantidad the new cantidad
	 */
	public void setcantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
}