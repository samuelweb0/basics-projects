package ProductsStore;
public class ValidationStock  {
	public static void main(String[] args) {
	
	ProductsValue productsValue = new ProductsValue();
	productsValue.name = "Ferro";
	productsValue.minimumQuantity = 10;
	productsValue.quantityStock = 90;
	
	System.out.println("Produto: " +productsValue.name);
	System.out.println("Quantidade mínima: " +productsValue.minimumQuantity);
	System.out.println("Quantidade atual: " +productsValue.quantityStock);

	System.out.println("Reposição desejada: " +productsValue.bringingReplacement());
	}	
	}