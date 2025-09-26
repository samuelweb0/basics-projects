package projetov2;

import java.util.Scanner;

public class AposentadoriaPossivel {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite a sua idade: ");
			Integer idade = scanner.nextInt();
			System.out.println("Quantos anos você está na empresa? ");
			Integer anosEmpresa = scanner.nextInt();
			
			Boolean idadeMinima = idade == 55;
			Boolean anosMinimosEmpresa = anosEmpresa == 25;
			Boolean verdadeiroMinimoEmpresa = anosMinimosEmpresa == true;
			Boolean verdadeiroIdadeMinima = idadeMinima == true;
			Boolean possibilidadeAposentadoria = verdadeiroIdadeMinima && verdadeiroIdadeMinima;
			if (possibilidadeAposentadoria) {
				System.out.println("Parabéns pelo esforço! Você pode se aposentar.");
			} else {
				System.out.println("Que pena, você não pode se aposentar.");
			}

			scanner.close();
		}
}
