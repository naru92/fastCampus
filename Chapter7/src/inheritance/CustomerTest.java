package inheritance;

public class CustomerTest {
	 public static void main(String[] args) {
		
		 Customer customerLee = new Customer(10010,"�̼���");
		 customerLee.bounsPoint = 1000;
		 System.out.println(customerLee.showCustomerInfo());
		 
		 
		 VIPcustomer customerKim = new VIPcustomer(10020, "������"); 
		 customerKim.bounsPoint = 10000;
		 System.out.println(customerKim.showCustomerInfo());
	}
}
