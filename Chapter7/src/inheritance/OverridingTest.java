package inheritance;

public class OverridingTest {
	public static void main(String[] args) {
		
		
		 Customer customerLee = new Customer(10010,"�̼���");
		 customerLee.bounsPoint = 1000;
		 
		 
		 
		 VIPcustomer customerKim = new VIPcustomer(10020, "������"); 
		 customerKim.bounsPoint = 10000;
		 
		 int priceLee = customerLee.calcPrice(10000);
		 int priceKim = customerKim.calcPrice(10000);
		 
		 System.out.println(customerKim.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		 System.out.println(customerLee.showCustomerInfo() + "���ұݾ��� " + priceLee + "�� �Դϴ�.");
		 
		 
		 Customer customerNo = new VIPcustomer(10030,"������");
		 customerNo.bounsPoint = 10000;
		 System.out.println((customerLee.showCustomerInfo() + "���ұݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�."));
		 
	}   
}
