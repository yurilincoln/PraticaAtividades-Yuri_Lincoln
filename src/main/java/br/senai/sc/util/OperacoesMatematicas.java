package br.senai.sc.util;

public class OperacoesMatematicas {
	
	public static Double somaDeDoisValoresReais(Double num, Double num1) {
		if (num != null && num1 != null) {
			double x = num;
			double y = num1;
			double soma = x + y;
			return soma;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores reais para o cálculo.");
	}

	public static Double subtraiDeDoisValoresReais(Double num, Double num1) {
		if (num != null && num1 != null) {
			double x = num;
			double y = num1;
			double soma = x - y;
			return soma;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores reais para o cálculo.");
	}

	public static Double multiplicaDeDoisValoresReais(Double num, Double num1) {
		if (num != null && num1 != null) {
			double x = num;
			double y = num1;
			double soma = x * y;
			return soma;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores reais para o cálculo.");
	}

	public static Double divideDeDoisValoresReais(Double num, Double num1) {
		if (num1 == 0) {
			throw new NumberFormatException(
					"Não é possível dividir um número por zero.");
		}else{
		if(num != null && num1 != null) {
			double x = num;
			double y = num1;
			double soma = (x / y);
			return soma;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores reais para o cálculo.");
	}

	}
	
}
