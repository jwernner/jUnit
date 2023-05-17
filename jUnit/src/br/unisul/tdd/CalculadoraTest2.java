package br.unisul.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest2 {
	
	@Test
	public void deveriaSomarDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int valorA = 6;
		int valorB = 3;
		
		int soma = calc.somar(valorA, valorB);
		
		Assert.assertEquals(9, soma);
	}
	
	@Test
	public void deveriaSubtrairDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int valorA = 6;
		int valorB = 3;
		
		int subtrair = calc.subtracao(valorA, valorB);
		
		Assert.assertEquals(3, subtrair);
	}
	
	@Test
	public void deveriaDividirDoisNumerosPositivos() {
		
		Calculadora calc = new Calculadora();
		int valorA = 6;
		int valorB = 3;
		
		int dividir = calc.divisao(valorA, valorB);
		
		Assert.assertEquals(2, dividir);
	}
	
}
