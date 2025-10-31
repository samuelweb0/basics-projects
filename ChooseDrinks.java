package projetov2;

import java.util.Scanner;

public class ChooseDrinks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] listDrinks = {"Àgua", "Refrigerante", "Suco de uva", "Café"};
		
		for (int variableFor = 0; variableFor < listDrinks.length; variableFor++) { 
			System.out.println("(" +variableFor+ ") "+ "Bebida:" +listDrinks[variableFor]);
		} printBars();
			enterNumber();
		Integer receiveNumber = scanner.nextInt();
		
		System.out.print("Você escolheu a bebida " +listDrinks[receiveNumber]);
	}
	static void printBars() {
		System.out.println("//////////////////////////////////////////////////////////");
	}
	static void enterNumber() {
		System.out.print("Digite o número de qual bebida deseja: ");
	}
	}
