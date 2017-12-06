package br.pro.software.erastostenes;

public class NumeroInvalidoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NumeroInvalidoException() {
		super("O numero tem que ser maior que 1");
	}
}
