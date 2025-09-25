package projetov2;

import java.util.Scanner;
public class GastoFamiliar {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite o valor da conta de água: ");
			Long contaDeAgua = scanner.nextLong();
			System.out.print("Digite o valor da conta de luz: ");
			Long contaDeLuz = scanner.nextLong();
			System.out.print("Digite o valor da conta de telefone: ");
			Long contaDeTelefone = scanner.nextLong();
			System.out.print("Digite o valor da mensalidade do seu filho(a): ");
			Long mensalidadeEscolar = scanner.nextLong();
			System.out.print("Digite o valor da fatura do mês de seu cartão: ");
			Long faturaDoCartao = scanner.nextLong();
			System.out.print("Digite o valor gasto de compras no mercado: ");
			Long comprasMercado = scanner.nextLong();
			
			Long Total = contaDeAgua += contaDeLuz += contaDeTelefone += mensalidadeEscolar += faturaDoCartao =+ comprasMercado;
			System.out.println("Total de despesa neste mês: " +Total);
			
			scanner.close();
		}
}
