package br.unisul.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest2 {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int valorA = 7;
		int valorB = 3;
		
		int soma = calc.somar(valorA, valorB);
		
		Assert.assertEquals(10, soma);
	}
	
	@Test
	public void deveriaSubtraisDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int valorA = 7;
		int valorB = 3;
		
		int subtrair = calc.subtracao(valorA, valorB);
		
		Assert.assertEquals(4, subtrair);
	}
}
