package operator;

public class OperatiorEx4 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10)>10) && ((i= i+2) <10);
		System.out.println(num1);
		System.out.println(i);
		System.out.println(value);
		
		
		int num2 = (5>3)? 10:20;
		System.out.println(num2);
		
		int num3 = 10;
		int num4 = 20;
		
		int max = (num3 > num4)? num3:num4;
		System.out.println(max);
		
		
	}
}
