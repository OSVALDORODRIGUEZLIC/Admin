package com.netasystems.clases;

import java.util.ArrayList;
import java.util.List;

    
// 
/**
 * The Class Carrera de competidores
 * 
 */
public class Carrera {
	
	/** The equipos. */
	List<Equipo> equipos = new ArrayList<Equipo>();
	
	/** The flag taken. */
	private boolean flagTaken = false;
	
	/** The flag team F. */
	private boolean flagTeamF = false;

	
	/**
	 * Aquire flag.
	 *
	 * @param threadName the thread name
	 * @return true, if successful
	 */
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("Bandera tomada por : "+threadName);
		flagTaken = true;
		return true;
	}
	
	
	/**
	 * Release flag.
	 */
	public void releaseFlag() {
		flagTaken = false;
	}
	
	
	/**
	 * Checks if is flag team F.
	 *
	 * @return true, if is flag team F
	 */
	public synchronized boolean isFlagTeamF() {
		return flagTeamF;
	}
	
	
	/**
	 * Sets the flag team F.
	 *
	 * @param flagTeamF the new flag team F
	 */
	public synchronized void setFlagTeamF(boolean flagTeamF) {
		this.flagTeamF = flagTeamF;
	}
	
	
	/**
	 * Adds the team.
	 *
	 * @param e the e
	 */
	public void addTeam(Equipo e) {
		equipos.add(e);
	}
	
	/**
	 * Mostrar restantes.
	 */
	public void mostrarRestantes() {
		for(Equipo e : equipos) {
			System.out.println("Equipo "+e.toString()+" restantes: "+e.getPendientes());
		}
	}
}