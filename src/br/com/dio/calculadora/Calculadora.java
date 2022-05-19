package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float a,b;
		
		System.out.println("Digite o primeiro valor: ");
		a = entrada.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = entrada.nextFloat();
		
		float soma = soma(a, b);
		float subtrai = subtrai(a, b);
		float multiplica = multiplica(a, b);
		float divide = divide(a, b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtração: " + subtrai);
		System.out.println("multiplicação: " + multiplica);
		System.out.println("divisão: " + divide);
	}

	public static float soma(float a, float b) {
		return a + b;
		
	}
	public static float subtrai(float a, float b) {
		return a - b;
		
	}
	public static float multiplica(float a, float b) {
		return a * b;
		
	}
	public static float divide(float a, float b) {
		return a / b;
		
	}
}
