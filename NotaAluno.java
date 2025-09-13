package projetov2;

import java.util.Scanner;

public class NotaAluno {
	public static void main(String[] args) {
		Scanner scannear = new Scanner(System.in);
			Boolean VerdadeiraNota= true;
				Boolean FalsaNota= false;
					
					
		System.out.println("Qual é o nome do aluno? ");
				
				String Aluno = scannear.nextLine();
					System.out.println("Digite a nota obtida por este aluno no bimestre:");
					Integer Numero = scannear.nextInt();	
					Boolean Nota = Numero >=70;
					
							 if (Nota) {
										System.out.println("Parabéns, o aluno(a) "+ Aluno +", passou de ano!");
							} else {
									System.out.println("Que pena! O aluno(a) " + Aluno +", não passou de ano." );
							}
				
					
					
		}


		
			}

		
