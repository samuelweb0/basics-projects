package projetov2;

import java.util.Scanner;

public class Desconto100Reais {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o valor do produto: ");
			Long valorDoProduto = scannear.nextLong();
			int Frete = 15;
			Long totalComFrete = valorDoProduto + Frete;
					
			Boolean semFrete = valorDoProduto >= 100;
			if (semFrete) {
			System.out.println("Valor total da compra: " +ValorDoProduto);
			} else {
			System.out.println("Valor total da compra: " +TotalComFrete);
			}
			
			scanner.close();
		}
}
