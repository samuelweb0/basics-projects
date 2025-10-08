package projetov2;

import java.util.Scanner;

public class UtilizandoFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] nomesFuncionarios = {"Heloisa, Yasmin, Felipe, Ronaldo, Yuri"};
		for(int variavelFor = 0; variavelFor < nomesFuncionarios.length; variavelFor++) { 
			
			System.out.print("Digite a pontuação atingida pelo grupo de "+nomesFuncionarios[variavelFor]+ ": " );
			Integer valorMeta = scanner.nextInt();
			Integer metaMinima = 550;
			
			Boolean metaMaior = valorMeta >= metaMinima;
			if (metaMaior) {
				System.out.println("O grupo de " +nomesFuncionarios[variavelFor]+ " teve sua meta atingida.");
			} else {
				System.out.println("O grupo de " +nomesFuncionarios[variavelFor]+ " não teve sua meta atingida."); 
			}
		}
		
		scanner.close();
	}
}
