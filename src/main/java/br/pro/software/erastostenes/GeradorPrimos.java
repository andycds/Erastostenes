package br.pro.software.erastostenes;

public class GeradorPrimos {
	final int primeiroPrimo = 2;
	
	public String ate(int numero) throws NumeroInvalidoException {
		if (numero < primeiroPrimo) {
			throw new NumeroInvalidoException();
		} 
		boolean[] naoPrimos = new boolean[numero+1];
		naoPrimos[0] = true;
		naoPrimos[1] = true;
		for (int x = 2; x < naoPrimos.length;x++) {
			int crivo =  2*x;
			while (crivo <= numero) {
				naoPrimos[crivo] = true; 
				crivo += x;
			}
		}
		StringBuilder lista = new StringBuilder();
		for (int i= 0; i < naoPrimos.length;i++) {
			if (!naoPrimos [i]) {
				lista.append(i+", ");
				
			}
		}
		return lista.toString().substring(0,lista.length()-2);
		
	}
}
