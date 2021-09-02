package stream;

import java.util.*;

public class TravelTest {
	
		public static void main(String[] args) {
			
		
		
		TravelCustomer cutomerLee = new TravelCustomer("ÀÌ¼ø½Å", 40, 100);
		TravelCustomer cutomerKim = new TravelCustomer("±èÀ¯½Å", 20, 100);
		TravelCustomer cutomerHong = new TravelCustomer("È«±æµ¿", 13, 50);
		
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		customerList.add(cutomerLee);
		customerList.add(cutomerKim);
		customerList.add(cutomerHong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println();
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		
	}
	
}
