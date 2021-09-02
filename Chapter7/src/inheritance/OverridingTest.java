package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		
		
		 Customer customerLee = new Customer(10010,"이순신");
		 customerLee.bounsPoint = 1000;
		 
		 
		 
		 VIPcustomer customerKim = new VIPcustomer(10020, "김유신"); 
		 customerKim.bounsPoint = 10000;
		 
		 int priceLee = customerLee.calcPrice(10000);
		 int priceKim = customerKim.calcPrice(10000);
		 
		 System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		 System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		 
		 
		 Customer customerNo = new VIPcustomer(10030,"나몰라");
		 customerNo.bounsPoint = 10000;
		 System.out.println((customerLee.showCustomerInfo() + "지불금액은 " + customerNo.calcPrice(10000) + "원 입니다."));
		 
	}   
}
