package classpart;

public class FuctionTest {
	
	public static int addNum(int num1 , int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	
	public static int mutiple(int num3, int num4) {
		int mulTi = num3 * num4;
		return mulTi;
	}
	
	public static int divide(int num5, int num6) {
		int div = num5 / num6;
		return div;
	}
	
	public static int minus(int num7, int num8) {
		int min = num7 - num8;
		return min;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		int i;
		
		for(i= 0; i<=100; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		
		int n3 = 10;
		int n4 = 2;
		int total2 = mutiple(n3, n4);
		
		int n5 = 10;
		int n6 = 2;
		int total3 = divide(n5, n6);
		
		int n7 = 10;
		int n8 = 2;
		int total4 = minus(n7, n8);
		
		
		sayHello("¾È³çÇÏ¼¼¿ä");
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		System.out.println(total2);
		System.out.println(total3);
		System.out.println(total4);
		
	}
}
