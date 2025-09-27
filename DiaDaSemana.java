package projetov2;

import java.util.Scanner;

public class DiaDaSemana {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite um dia da semana: ");
			String diaSemana = scanner.nextLine();
			switch (diaSemana) {
			case "1": diaSemana = "Domingo"; 
				break;
			case "2": diaSemana = "Segunda-Feira";
				break;
			case "3": diaSemana = "Terça-Feira";
				break;
			case "4": diaSemana = "Quarta-Feira";
				break;
			case "5": diaSemana = "Quinta-Feira";
				break;
			case "6": diaSemana = "Sexta-Feira";
				break;
			case "7": diaSemana = "Sábado";
				break;
			default: System.err.print("Digite um dia da semana! De 1 a 7.");
				System.exit(1);
			}
			System.out.print("Dia da semana: " + diaSemana );
			scanner.close();
		}
}
