package com.netasystem.main;

import java.util.ArrayList;
import java.util.List;
import com.netasystem.recetario.*;




/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		for(int i =0;i<11;i++) {
			ingredientes.add(new Ingrediente("NNombre "+ i, i+"00000"));
		}
		
		List<String> procedimientos = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			procedimientos.add(""+i);
		}
		
		String n1 = "Caldo de pollo";
		String n2 = "Ensalada";
		String n3 = "Sopa";
		
		Receta r0 = new Receta("Martin", ingredientes, procedimientos);
		Receta r1 = new Receta("Jorge", ingredientes, procedimientos);
		Receta r2 = new Receta("Isais", ingredientes, procedimientos);
		
		Recetario recetario = new Recetario();
		
		recetario.agregarReceta(n1, r0);
		recetario.agregarReceta(n2, r1);
		recetario.agregarReceta(n3, r2);
		
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Caldo de pollo");
		System.out.println("############################################################");
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Ensalada");
		System.out.println("############################################################");
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Sopa");
		System.out.println("############################################################");
		recetario.mostrarList();
		
	}

}