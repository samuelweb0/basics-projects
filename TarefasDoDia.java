package projetov2;

import java.util.Scanner;

public class TarefasDoDia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua 1° tarefa mais importante do seu dia: ");
		String primeiraTarefa = scanner.nextLine();
		System.out.print("Digite sua 2° tarefa mais importante do seu dia: ");
		String segundaTarefa = scanner.nextLine();
		System.out.print("Digite sua 3° tarefa mais importante do seu dia: ");
		String terceiraTarefa = scanner.nextLine();
		System.out.print("Digite sua 4° tarefa mais importante do seu dia: ");
		String quartaTarefa = scanner.nextLine(); 
		System.out.print("Digite sua 5° tarefa mais importante do seu dia: ");
		String quintaTarefa = scanner.nextLine();
		
		String [] todasTarefas = new String[5];
		todasTarefas[0] = primeiraTarefa;
		todasTarefas[1] = segundaTarefa;
		todasTarefas[2] = terceiraTarefa;
		todasTarefas[3] = quartaTarefa;
		todasTarefas[4] = quintaTarefa;
		
		String y = "";
		System.out.println("Suas tarefas mais importantes são:");
		for (int variavelFor = 0; variavelFor < todasTarefas.length; variavelFor++) {
			String atribuirValor = todasTarefas[variavelFor];
			String receberValor = atribuirValor += y;
			System.out.println("Tarefa " +variavelFor+ ": " +receberValor);
		}
		scanner.close();
	}
}
