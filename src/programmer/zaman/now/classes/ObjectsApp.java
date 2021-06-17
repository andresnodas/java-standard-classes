package programmer.zaman.now.classes;

import java.util.Objects;

import programmer.zaman.now.classes.data.Product;

public class ObjectsApp {

	public static void main(String[] args) {
		
		Product product = new Product();
		Product product2 = new Product();
		
		if(product != null)
			System.out.println(product.toString());
		
		if(product != null)
			System.out.println(product.hashCode());
		
		if(product != null)
			System.out.println(product.equals(product2));
		
		System.out.println(Objects.toString(product));
		System.out.println(Objects.hashCode(product));
		System.out.println(Objects.equals(product, product2));
		
	}
	
}
