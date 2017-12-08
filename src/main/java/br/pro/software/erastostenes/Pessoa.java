package br.pro.software.erastostenes;

import lombok.Data;

@Data
public class Pessoa {
	float altura;
	private float peso;
	
	public float me() {
		return getAltura();
	}
}
