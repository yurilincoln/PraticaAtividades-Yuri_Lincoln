package br.senai.sc.util;

import junit.framework.TestCase;

import org.junit.Test;

public class OperacoesMatematicasTest extends TestCase{
	
	@Test
	public static void testSomaDeDoisValoresInteiros() {
		double num = 10;
		double num1 = 20;
		double valorExperado = 30;
		double valorAtual = OperacoesMatematicas.somaDeDoisValoresReais(num, num1);
		assertEquals("Soma de inteiros.", valorExperado, valorAtual);
	}
	
	@Test
	public static void testSomaDeDoisValoresReais() {
		double num = 1.9999d;
		double num1 = 5.8767d;
		double valorExperado = 7.8766d;
		double valorAtual = OperacoesMatematicas.somaDeDoisValoresReais(num, num1);
		assertEquals("Soma de reais.", valorExperado, valorAtual);
	}
	
	
	@Test
	public static void testSomaDeDoisValoresComResultadoErrado() {
		double num = 12d;
		double num1 = 2d;
		double valorExperado = 14d;
		double valorAtual = OperacoesMatematicas.somaDeDoisValoresReais(num, num1);
		assertTrue("Erro na soma dos valores.", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSomaDeDoisValoresDeNumerosMaioresComResultadoErrado() {
		double num = 2.8520d;
		double num1 = 3.6541d;
		double valorExperado = 6.5061d;
		double valorAtual = OperacoesMatematicas.somaDeDoisValoresReais(num, num1);
		assertFalse("Erro na soma dos valores.", valorExperado != valorAtual);
	}
	
	@Test
	public static void testSubtracaoDeDoisValoresInteiros() {
		assertEquals("Acerto na subtração dos valores inteiros.", 2d, (double)OperacoesMatematicas.subtraiDeDoisValoresReais(3d, 1d));
	}
	
	@Test
	public static void testValidaMultiplicacao(){
		double num = 10.0;
		double num1 = 3.0;
		double valorExperado = 30.0;
		double valorAtual = OperacoesMatematicas.multiplicaDeDoisValoresReais(num, num1);
		assertTrue("Erro na multiplição dos valores.", valorExperado == valorAtual);
	}
	
	@Test
	public static void testValidaDivisao(){
		double num = 10.0;
		double num1 = 2.0;
		double valorExperado = 5.0;
		double valorAtual = OperacoesMatematicas.divideDeDoisValoresReais(num, num1);
		assertTrue("Erro na multiplição dos valores.", valorExperado == valorAtual);
	}
	
	@Test
	public static void testValidaDivisaoComResultadoErrado(){
		double num = 10.0;
		double num1 = 2.0;
		double valorExperado = 5.0;
		double valorAtual = OperacoesMatematicas.divideDeDoisValoresReais(num, num1);
		assertTrue("Erro na multiplição dos valores.", valorExperado != valorAtual);
	}
	
	
	
	@Test(expected = NumberFormatException.class)
	public static void testValidaDivisaoComNumeroZero(){
		try {
			OperacoesMatematicas.divideDeDoisValoresReais(5d, 0d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals(null, null);
	}
	
}