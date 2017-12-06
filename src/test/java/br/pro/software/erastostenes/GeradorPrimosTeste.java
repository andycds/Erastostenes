package br.pro.software.erastostenes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeradorPrimosTeste {

	GeradorPrimos geradorPrimos = new GeradorPrimos();

	@Test
	public void testePrimosAteDois() throws NumeroInvalidoException {
		assertEquals("2", geradorPrimos.ate(2));
	}

	@Test
	public void testePrimosAteTres() throws NumeroInvalidoException {
		assertEquals("2, 3", geradorPrimos.ate(3));
	}

	@Test(expected=NumeroInvalidoException.class)
	public void testarNumeroPrimosAteUm() throws NumeroInvalidoException {
			geradorPrimos.ate(1);
	}

	@Test
	public void testePrimoAteDez() throws NumeroInvalidoException {
		assertEquals("2, 3, 5, 7", geradorPrimos.ate(10));
		
	}
	
}