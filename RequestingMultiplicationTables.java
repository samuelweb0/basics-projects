package JavaProjectsV2;
import java.util.Scanner;

public class RequestingMultiplicationTables {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Digite o número que você deseja multiplicar >>> ");
	Integer y = 0;
	Integer multiplying = scanner.nextInt();
	
	printingMultiplication(multiplying, y);
	
	scanner.close();
	}
	static void printingMultiplication (Integer multiplying, Integer y) {
		Integer resolution = multiplying * y;
		System.out.println(multiplying + "x" + y + "=" + resolution);
		if(y < 10) {
			printingMultiplication(multiplying, y + 1);
		}
		
	}
	}
