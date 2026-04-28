package projetov2;

import java.util.Scanner;

public class gradeStudents {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean trueGrade= true;
		Boolean falseGrade= false;
		System.out.println("Qual é o nome do aluno? ");
		String student = scannear.nextLine();
		
		System.out.println("Digite a nota obtida por este aluno no bimestre:");
		Integer number = scannear.nextInt();	
		Boolean grade = number >= 70;
		if (grade) {
		System.out.println("Parabéns, o aluno(a) "+ Aluno +", passou de ano!");
		} else {
		System.out.println("Que pena! O aluno(a) " + Aluno +", não passou de ano." );
		}		
		scanner.close();		
			}	
		}
