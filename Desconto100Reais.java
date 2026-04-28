package projetov2;

import java.util.Scanner;

public class Desconto100Reais {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o valor do produto: ");
			Long valueProduct = scannear.nextLong();
			int freight = 15;
			Long totalFreight = valueProduct + freight;
					
			Boolean noFreight = valueProduct >= 100;
			if (noFreight) {
			System.out.println("Valor total da compra: " +valueProduct);
			} else {
			System.out.println("Valor total da compra: " +totalFreight);
			}
			scanner.close();
		    	}
            }
