package br.pro.software.erastostenes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(GeradorPrimos.class)
public class TestePrivado {
	@Test
	public void testePrivado() throws Exception {
		GeradorPrimos gpM = PowerMockito.spy(new GeradorPrimos());
		PowerMockito.doReturn(true).when(gpM, "metodoPrivado");
		assertTrue(gpM.metodoPublico());
		
		GeradorPrimos gp = new GeradorPrimos();
		assertFalse(gp.metodoPublico());
	}
}
