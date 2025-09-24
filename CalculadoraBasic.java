package projetov2;

import java.util.Scanner;

public class CalculadoraBasic {
		public static void main(String[] args) {
			Scanner scannear = new Scanner(System.in);
								System.out.print("Digite o primeiro valor da operação desejada: ");
							Long PrimeiroValor = scannear.nextLong();
						System.out.print("Digite o segundo valor da operação desejada: ");
					Long SegundoValor = scannear.nextLong();
				
				Long ResultadoSubtracao = PrimeiroValor - SegundoValor;
				
			System.out.println(PrimeiroValor+ " dividido por " +SegundoValor+ " é: " +PrimeiroValor / SegundoValor);
				
		System.out.println(PrimeiroValor+ " multiplicado por " +SegundoValor+ " é: " +PrimeiroValor * SegundoValor);
				
			System.out.println(PrimeiroValor+ " somado por " +SegundoValor+ " é: " +PrimeiroValor + SegundoValor);
			
				System.out.println(PrimeiroValor+ " subtraido por " +SegundoValor+ " é: " +ResultadoSubtracao);
					
				System.out.println("Módulo de " +PrimeiroValor+ " com " +SegundoValor+ " é: "  +PrimeiroValor % SegundoValor);
				
							
							
							
							
			scannear.close();				
							
		}
}
