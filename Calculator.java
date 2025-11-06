package javaPackge;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		productionCalculator();
	}
	static void productionCalculator () {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		Long firstValue = scanner.nextLong();
		System.out.print("Digite o segundo valor: ");
		Long secondValue = scanner.nextLong();
		Long operationSubtraction = firstValue - secondValue;
		
		String[] operations = {"Divisão", "Multiplicação", "Adição", "Subtração", "Módulo"};
		System.out.println("Escolha uma operação: ");
		for (int variableFor = 0; variableFor < operations.length; variableFor++) {
			System.out.println("(" +(+1+variableFor)+ ") " +operations[variableFor] );
		}
		System.out.print("===> " );
		Integer chooseOperation = scanner.nextInt();
		Boolean errorNumber = chooseOperation == 0 || chooseOperation > 5;
		if (errorNumber) {
			System.err.println("Operação não encontrada!");
		}
		Boolean operationDivision = chooseOperation == 1;
		Boolean operationMultiplication = chooseOperation == 2;
		Boolean operationAddition = chooseOperation == 3;
		Boolean chooseSubtraction = chooseOperation == 4;
		Boolean operationModule = chooseOperation == 5;
		if (operationDivision) {
			System.out.print(firstValue+ " dividido por " +secondValue+ " é igual a: " +firstValue / secondValue);
		} else if (operationMultiplication) {
			System.out.print(firstValue+ " multiplicado por " +secondValue+ " é igual a: " +firstValue * secondValue);
		} if (operationAddition) {
			System.out.print(firstValue+ " somado por " +secondValue+ " é igual a: " +firstValue + secondValue);
		} else if (chooseSubtraction) {
			System.out.print(firstValue+ " subtraído por " +secondValue+ " é igual a: " +operationSubtraction);
		} else if (operationModule) {
			System.out.print(firstValue+ " dividido por " +secondValue+ " resulta no resto de: " +firstValue % secondValue);
		}
		scanner.close();
		return;
	}
	}
