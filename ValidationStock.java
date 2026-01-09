package ProductsStore;

import java.util.Scanner;
public class ValidationStock  {
	public static void main(String[] args) {
	
	ProductsValue productsValue = new ProductsValue();
	Scanner scanner = new Scanner(System.in);
	productsValue.name = "Ferro";
	productsValue.minimumQuantity = 10;
	productsValue.quantityStock = 0;
	
	System.out.println("Produto: " +productsValue.name);
	System.out.println("Quantidade mínima: " +productsValue.minimumQuantity);
	System.out.println("Quantidade atual: " +productsValue.quantityStock);

	System.out.println("Reposição desejada: " +bringingReplacement(productsValue));
	
	scanner.close();
	}
	static boolean bringingReplacement (ProductsValue productsValue) {
	if (productsValue.quantityStock < productsValue.minimumQuantity) {
	return true;	
	}
	return false;
	}	
	}
	

