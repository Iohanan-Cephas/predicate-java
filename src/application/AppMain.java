package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class AppMain {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		/*list.removeIf(new ProductPredicate());*/ /*--- INTERFACE IMPLEMENTATION ---*/
		
		/*list.removeIf(Product::staticPredicate);*/ /*--- REFERENCE METHOD (STATIC) ---*/
		
		/*list.removeIf(Product::nonStaticPredicate);*/ /*--- REFERENCE METHOD (non STATIC) ---*/
		
		/*double min = 100.00;
		Predicate<Product> pred = p -> p.getPrice() >= min;
		list.removeIf(pred);*/ /*--- LAMBDA EXPRESSION ---*/
		
		double min = 100.00;
		list.removeIf(p -> p.getPrice() >= min); /*--- LAMBDA EXPRESSION INLINE ---*/
		
		for(Product p : list) {
			System.out.println(p);
		}
	}
}
