package projetov2;

import java.util.Scanner;

public class PossibleRetirement{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Digite a sua idade: ");
			Integer age = scanner.nextInt();
			System.out.println("Quantos anos você está na empresa? ");
			Integer yearsCompany = scanner.nextInt();
			Boolean minimumAge = age == 55;
			Boolean minimumYearsCompanies = yearsCompany == 25;
			Boolean trueMinimumCompany = minimumYearsCompanies == true;
			Boolean trueMinimumAge = minimumAge == true;
			Boolean possibilityRetirement = minimumYearsCompanies && trueMinimumAge;
			if (possibilityRetirement) {
				System.out.println("Parabéns pelo esforço! Você pode se aposentar.");
			} else {
				System.out.println("Que pena, você não pode se aposentar.");
			}
			scanner.close();
		}
		}
