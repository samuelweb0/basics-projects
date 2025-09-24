package projetov2;

import java.util.Scanner;

public class Desconto100Reais {
		public static void main(String[] args) {
			Scanner scannear = new Scanner(System.in);
			
			System.out.print("Digite o valor do produto: ");
				Long ValorDoProduto = scannear.nextLong();
						int Frete = 15;
					Long TotalComFrete = ValorDoProduto + Frete;
					
					Boolean SemFrete = ValorDoProduto >= 100;
						if (SemFrete) {
							System.out.println("Valor total da compra: " +ValorDoProduto);
						} else {
							System.out.println("Valor total da compra: " +TotalComFrete);
						}
			scannear.close();
		}
}
