package br.senai.sc.util;

import junit.framework.TestCase;

import org.junit.Test;


public class ValidadorCPFTest extends TestCase {

	@Test
	public static void testRetiraCaracteresInvalidosComLetras() {
		String cpfParaValidar = "04776773473brbrbrbrbrbr";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
	public static void testRetiraCaracteresInvalidosComPontoHifen() {
		String cpfParaValidar = "047.767.734-73";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
	public static void testRetiraCaracteresInvalidosComSimbolosEspeciais() {
		String cpfParaValidar = "04776773473@#$#$%@#@_()";
		String cpfApenasNumeros = ValidadorCPF.retiraCaracteresInvalidos(cpfParaValidar);
		assertEquals("04776773473", cpfApenasNumeros);
	}
	
	
	public static void testValidaCPFNulo() {
		String cpfParaValidar = "";
		boolean padrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, padrao);
	}
	
	public static void testValidaCPFMenosDigitos() {
		String cpfParaValidar = "1023049020";
		boolean padrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, padrao);
	}
	
	public static void testValidaCPFMaisDigitos() {
		String cpfParaValidar = "102304902052";
		boolean padrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, padrao);
	}
		
	public static void testValidaCPFComCaractere() {
		String cpfParaValidar = "1b230490205a";
		boolean padrao = ValidadorCPF.validaCPF(cpfParaValidar);
		assertEquals(false, padrao);
	}
	
		public static void testIsCPFPadrao() {
			String cpfParaValidar = "22222222222";
			boolean padrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
			assertEquals(true, padrao);
		}
		
		public static void testIsCPFPadraoUm() {
			String cpfParaValidar = "00000000000";
			boolean padrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
			assertEquals(true, padrao);
		}
		
		public static void testIsCPFPadraoDois() {
			String cpfParaValidar = "22222222222";
			boolean padrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
			assertEquals(true, padrao);
		}
		
		public static void testIsCPFPadraoTres() {
			String cpfParaValidar = "33333333333";
			boolean padrao = ValidadorCPF.isCPFPadrao(cpfParaValidar);
			assertEquals(true, padrao);
		}
		
		public static void testcalculaDigitoVerificador93() {
			String cpfParaValidar = "243357233";
			String padrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
			assertEquals("93", padrao);
		}
		
		public static void testcalculaDigitoVerificador25() {
			String cpfParaValidar = "858864414";
			String padrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
			assertEquals("25", padrao);
		}
		
		public static void testcalculaDigitoVerificador90() {
			String cpfParaValidar = "767880551";
			String padrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
			assertEquals("90", padrao);
		}
		
		public static void testcalculaDigitoVerificador07() {
			String cpfParaValidar = "120093614";
			String padrao = ValidadorCPF.calculaDigitoVerificador(cpfParaValidar);
			assertEquals("07", padrao);
		}
}
