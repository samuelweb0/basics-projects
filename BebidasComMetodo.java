package projetov2;

import java.util.Scanner;

public class BebidasComMetodo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] listaBebidas = {"Àgua", "Refrigerante", "Suco de uva", "Café"};
		
		for (int variavelFor = 0; variavelFor < listaBebidas.length; variavelFor++) { 
			System.out.println("(" +variavelFor+ ") "+ "Bebida:" +listaBebidas[variavelFor]);
		} impressaoBarras();
			impressaoDigitarNumero();
		Integer receberNumero = scanner.nextInt();
		
		System.out.print("Você escolheu a bebida " +listaBebidas[receberNumero]);
	}
	static void impressaoBarras() {
		System.out.println("//////////////////////////////////////////////////////////");
	}
	static void impressaoDigitarNumero() {
		System.out.print("Digite o número de qual bebida deseja: ");
	}
}
