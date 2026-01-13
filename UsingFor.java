package projetov2;

import java.util.Scanner;

public class UtilizandoFor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] namesEmployees = {"Heloisa, Yasmin, Felipe, Ronaldo, Yuri"};
		for(int variavelFor = 0; variavelFor < nomesFuncionarios.length; variavelFor++) { 
			
			System.out.print("Digite a pontuação atingida pelo grupo de "+nomesFuncionarios[variavelFor]+ ": " );
			Integer targetValue = scanner.nextInt();
			Integer targetMinimal = 550;
			
			Boolean targetLargest = targetValue >= targetMinimal;
			if (targetLargest) {
				System.out.println("O grupo de " +nomesFuncionarios[variavelFor]+ " teve sua meta atingida.");
			} else {
				System.out.println("O grupo de " +nomesFuncionarios[variavelFor]+ " não teve sua meta atingida."); 
			}
		}	
		scanner.close();
	}
}
