package com.netasystems.clases;


// TODO: 
/**
 * The Class Corredor.
 */
public class Corredor implements Runnable{
		
		/** The carrera. */
		private Carrera carrera;
		
		/** The corre. */
		private boolean corre = true;
		
		/** The name. */
		private String name;
		
		/** The equipo. */
		private Equipo equipo;
		
		
		/**
		 * Instantiates a new corredor.
		 *
		 * @param carrera the carrera
		 * @param name the name
		 * @param equipo the equipo
		 */
		public Corredor(Carrera carrera, String name, Equipo equipo) {
			this.carrera = carrera;
			this.name = name;
			this.equipo = equipo;
		}
		
		
		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			while(corre && !carrera.isFlagTeamF()) {
				boolean aquired = false;
				try {
					Thread.sleep(1500);
					if (!carrera.isFlagTeamF()) {
						aquired = carrera.aquireFlag(this.name);	
					}
					if(aquired) {
						Thread.sleep(2000);
						carrera.releaseFlag();
						this.corre = false;
						equipo.corredorTermina();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}

	}