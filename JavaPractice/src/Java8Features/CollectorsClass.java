package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product
{
	String productName;
	Float productPrice;
	
    Product(String productName, Float productPrice)
    {
    	this.productName = productName;
    	this.productPrice = productPrice;
    }
}

public class CollectorsClass {
	
	public static void main(String args[])
	{
		List<Product> listofProducts = new ArrayList<>();
		listofProducts.add(new Product("toothpaste",(float) 53.45));
		listofProducts.add(new Product("brush", (float) 20.00));
		listofProducts.add(new Product("Shaving Cream", (float) 45.00));
		listofProducts.add(new Product("Shaving Blade", (float) 16.00));
		
		//Collection of products into a list
		List<Float> listofPrice = listofProducts.stream().map(p->p.productPrice).collect(Collectors.toList());
		System.out.println(listofPrice);
		
		//Collection of Products into a Set
		Set<Float> listofPrice1 = listofProducts.stream().map(p->p.productPrice).collect(Collectors.toSet());
		System.out.println(listofPrice1);
		
		//Sum of all the Prices
		System.out.println(listofProducts.stream().collect(Collectors.summingDouble(p->p.productPrice)));
		
		//Average of Prices
		System.out.println(listofProducts.stream().collect(Collectors.averagingDouble(p->p.productPrice)));
		
		//Count of the Number of Elements
		System.out.println(listofProducts.parallelStream().collect(Collectors.counting()));
		
	}

}
