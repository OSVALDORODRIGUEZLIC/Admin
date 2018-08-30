package com.netasystems.calculadora;

// 
/**
 * The Class Calculadora.
 */
public class Calculadora {

	/**
	 * Suma.
	 *
	 * @param op1 the op 1
	 * @param op2 the op 2
	 * @return the double
	 */
	public double suma (double op1, double op2) {
		return op1 + op2;
	}
	
	/**
	 * Resta.
	 *
	 * @param op1 the op 1
	 * @param op2 the op 2
	 * @return the double
	 */
	public double resta (double op1, double op2) {
		return op1 - op2;
	}
	
	/**
	 * Multiplica.
	 *
	 * @param op1 the op 1
	 * @param op2 the op 2
	 * @return the double
	 */
	public double multiplica (double op1, double op2) {
		return op1 * op2;
	}
	
	/**
	 * Divide.
	 *
	 * @param op1 the op 1
	 * @param op2 the op 2
	 * @return the double
	 */
	public double divide (double op1, double op2) {
		if (op2 == 0) {
			return 0;
		}
		return op1 / op2;
	}
	
	
}