package projetov2;

import java.util.Scanner;

public class CalculadoraBasic {
		public static void main(String[] args) {
			Scanner scannear = new Scanner(System.in);
		System.out.print("Digite o primeiro valor da operação desejada: ");
		Long PrimeiroValor = scannear.nextLong();
		System.out.print("Digite o segundo valor da operação desejada: ");
		Long segundoValor = scannear.nextLong();
				
		Long resultadoSubtracao = primeiroValor - segundoValor;
        Long resultadoSoma = primeiroValor + segundoValor;
			
		System.out.println(primeiroValor+ " dividido por " +segundoValor+ " é: " +primeiroValor / segundoValor);		
		System.out.println(primeiroValor+ " multiplicado por " +segundoValor+ " é: " +PrimeiroValor * segundoValor);
		System.out.println(primeiroValor+ " somado por " +segundoValor+ " é: " +resultadoSoma);
		System.out.println(primeiroValor+ " subtraido por " +segundoValor+ " é: " +sesultadoSubtracao);
		System.out.println("Módulo de " +primeiroValor+ " com " +segundoValor+ " é: "  +srimeiroValor % segundoValor);
			
			scannear.close();				
							
		}
}
